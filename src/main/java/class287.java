import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class287 {
   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "Z"
   )
   public boolean field4513 = false;
   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4520 = new String[]{method2401(method2400("\u0013se%\u0006")), method2401(method2400("\u0013se-\u0006")), method2401(method2400("\u000fv'\u0000")), method2401(method2400("\u001a-eBS")), method2401(method2400("\u0013se/\u0006")), method2401(method2400("\u0013se*\u0006")), method2401(method2400("\u0013se)\u0006")), method2401(method2400("\u0013se.\u0006")), method2401(method2400("\u0013se+\u0006")), method2401(method2400("\u0013se$\u0006")), method2401(method2400("\u0013se(\u0006"))};
   @OriginalMember(
      owner = "client!rp",
      name = "n",
      descriptor = "Lnaa;"
   )
   public static class113 field4514 = new class113(16, 3);
   @OriginalMember(
      owner = "client!rp",
      name = "m",
      descriptor = "Lnaa;"
   )
   public static class113 field4516 = new class113(2, 6);
   @OriginalMember(
      owner = "client!rp",
      name = "j",
      descriptor = "I"
   )
   public static int field4518 = 1403;
   @OriginalMember(
      owner = "client!rp",
      name = "f",
      descriptor = "I"
   )
   public static int field4505;
   @OriginalMember(
      owner = "client!rp",
      name = "k",
      descriptor = "I"
   )
   public int field4506;
   @OriginalMember(
      owner = "client!rp",
      name = "g",
      descriptor = "I"
   )
   public static int field4508;
   @OriginalMember(
      owner = "client!rp",
      name = "e",
      descriptor = "I"
   )
   public static int field4509;
   @OriginalMember(
      owner = "client!rp",
      name = "c",
      descriptor = "I"
   )
   public static int field4510;
   @OriginalMember(
      owner = "client!rp",
      name = "i",
      descriptor = "I"
   )
   public int field4511;
   @OriginalMember(
      owner = "client!rp",
      name = "d",
      descriptor = "I"
   )
   public static int field4512;
   @OriginalMember(
      owner = "client!rp",
      name = "l",
      descriptor = "I"
   )
   public static int field4515;
   @OriginalMember(
      owner = "client!rp",
      name = "h",
      descriptor = "I"
   )
   public static int field4517;
   @OriginalMember(
      owner = "client!rp",
      name = "o",
      descriptor = "I"
   )
   public static int field4519;
   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "Lea;"
   )
   public class520 field4507;

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2391(int arg0) {
      try {
         field4516 = null;
         field4514 = null;
         if (arg0 != 3301) {
            method2394(95);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4520[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method2392(boolean arg0) {
      try {
         ++field4505;
         if (!arg0) {
            this.method2396(96, (class610)null, -4, false);
         }

         return this.field4507.field7905.method5002(this.field4506, (byte)96);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4520[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILica;I)V"
   )
   private final void method2393(int arg0, class354 arg1, int arg2) {
      try {
         if (arg0 == -5) {
            if (arg2 != 1) {
               if (arg2 != 2) {
                  if (~arg2 != -4) {
                     if (~arg2 == -5) {
                        this.field4506 = -1;
                     }
                  } else {
                     this.field4513 = true;
                  }
               } else {
                  this.field4511 = arg1.method2872(arg0 + 7);
               }
            } else {
               this.field4506 = arg1.method2848(arg0 + -122);
            }

            ++field4510;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4520[4] + arg0 + ',' + (arg1 != null ? field4520[3] : field4520[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2394(int arg0) {
      boolean var1 = client.field1786;

      try {
         if (class476.field7237 != null) {
            int var2 = 0;
            if (var1 || var2 < class476.field7237.length) {
               do {
                  int var3 = 0;
                  if (var1) {
                     class476.field7237[var2][var3] = class314.field4858;
                     ++var3;
                  }

                  while(true) {
                     while(~var3 > ~class476.field7237[var2].length) {
                        class476.field7237[var2][var3] = class314.field4858;
                        ++var3;
                     }

                     if (!var1) {
                        ++var2;
                        break;
                     }

                     ++var3;
                  }
               } while(var2 < class476.field7237.length);
            }
         }

         ++field4517;
         int var4 = -31 % ((arg0 - 63) / 39);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4520[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2395(byte arg0) {
      try {
         class509.field7791 = class678.field10091;
         class292.field4635 = 0;
         class711.field10691 = 0;
         if (arg0 > -37) {
            field4514 = null;
         }

         class293.field4646 = new class409[1000];
         class410.field6383 = 0;
         class366.field5665 = new class409[500];
         class590.field8696 = new int[class461.field7016][class247.field3734 + 1][class365.field5634 + 1];
         class717.field10736 = 0;
         ++field4519;
         class681.field10157 = new class409[2000];
         class419.field6486 = false;
         class758.field11221 = class678.field10091;
         class463.field7035 = new class409[500];
         if (class546.field8193 instanceof class74) {
            class439.field6716 = false;
         } else {
            class439.field6716 = true;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4520[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILha;IZ)Ljq;"
   )
   public final class672 method2396(int arg0, class610 arg1, int arg2, boolean arg3) {
      try {
         ++field4509;
         long var5 = (long)(arg1.field8875 << 19 | this.field4506 | arg2 << 16 | (arg3 ? 262144 : 0));
         class672 var7 = (class672)this.field4507.field7911.method2544(false, var5);
         if (var7 != null) {
            return var7;
         } else {
            if (arg0 != 3) {
               method2397(67, (class588)null);
            }

            if (!this.field4507.field7905.method5002(this.field4506, (byte)96)) {
               return null;
            } else {
               class776 var8 = class776.method5639(this.field4507.field7905, this.field4506, 0);
               if (var8 != null) {
                  var8.field11399 = var8.field11401 = var8.field11402 = var8.field11397 = 0;
                  if (arg3) {
                     var8.method5637();
                  }

                  for(int var9 = 0; arg2 > var9; ++var9) {
                     var8.method5646();
                  }
               }

               class672 var10 = arg1.method606(var8, true);
               if (var10 != null) {
                  this.field4507.field7911.method2545(var5, arg0 + 117, var10);
               }

               return var10;
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field4520[9] + arg0 + ',' + (arg1 != null ? field4520[3] : field4520[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(ILhf;)I"
   )
   public static final int method2397(int arg0, class588 arg1) {
      try {
         int var2 = 41 % ((arg0 - -49) / 39);
         ++field4512;
         if (class453.field6943 != arg1) {
            if (class716.field10733 == arg1) {
               return 8448;
            } else if (class582.field8586 == arg1) {
               return 34165;
            } else if (class154.field2302 != arg1) {
               if (class371.field5756 == arg1) {
                  return 34023;
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return 260;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4520[7] + arg0 + ',' + (arg1 != null ? field4520[3] : field4520[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method2398(class354 arg0, int arg1) {
      try {
         while(true) {
            int var3 = arg0.method2855(arg1 + -31006);
            if (~var3 == -1) {
               ++field4508;
               if (arg1 != -1) {
                  field4518 = -25;
                  return;
               }

               return;
            }

            this.method2393(-5, arg0, var3);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4520[10] + (arg0 != null ? field4520[3] : field4520[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         int var12 = arg2 + 1;
         class689.method5076(arg5, arg1, (byte)57, class512.field7820[arg2], arg0);
         int var7 = -77 / ((-12 - arg4) / 60);
         ++field4515;
         int var13 = arg3 - 1;
         class689.method5076(arg5, arg1, (byte)57, class512.field7820[arg3], arg0);
         int var8 = var12;
         if (var6 || ~var13 <= ~var12) {
            do {
               int[] var9 = class512.field7820[var8];
               var9[arg1] = var9[arg5] = arg0;
               ++var8;
            } while(~var13 <= ~var8);

         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field4520[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
