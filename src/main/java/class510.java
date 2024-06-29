import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class510 extends class70 {
   @OriginalMember(
      owner = "client!tha",
      name = "K",
      descriptor = "I"
   )
   private int field7116 = -1;
   @OriginalMember(
      owner = "client!tha",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7118 = new String[]{method3854(method3853("\\sJK\n\u0000")), method3854(method3853("\\sJK\u000e\u0000")), method3854(method3853("\\sJK\t\u0000")), method3854(method3853("\\sJK\r\u0000")), method3854(method3853("\\sJK\u000b\u0000")), method3854(method3853("\\sJK\u0006\u0000")), method3854(method3853("\\sJK\u0007\u0000")), method3854(method3853("S5\u0005K2")), method3854(method3853("\\sJK\f\u0000")), method3854(method3853("FnG\t")), method3854(method3853("\\sJK\b\u0000"))};
   @OriginalMember(
      owner = "client!tha",
      name = "Q",
      descriptor = "I"
   )
   public static int field7105;
   @OriginalMember(
      owner = "client!tha",
      name = "O",
      descriptor = "I"
   )
   public static int field7106;
   @OriginalMember(
      owner = "client!tha",
      name = "S",
      descriptor = "I"
   )
   public static int field7107;
   @OriginalMember(
      owner = "client!tha",
      name = "M",
      descriptor = "I"
   )
   private int field7109;
   @OriginalMember(
      owner = "client!tha",
      name = "L",
      descriptor = "I"
   )
   public static int field7110;
   @OriginalMember(
      owner = "client!tha",
      name = "J",
      descriptor = "I"
   )
   private int field7112;
   @OriginalMember(
      owner = "client!tha",
      name = "V",
      descriptor = "I"
   )
   public static int field7113;
   @OriginalMember(
      owner = "client!tha",
      name = "P",
      descriptor = "I"
   )
   public static int field7114;
   @OriginalMember(
      owner = "client!tha",
      name = "U",
      descriptor = "I"
   )
   public static int field7115;
   @OriginalMember(
      owner = "client!tha",
      name = "T",
      descriptor = "I"
   )
   public static int field7117;
   @OriginalMember(
      owner = "client!tha",
      name = "R",
      descriptor = "[I"
   )
   public static int[] field7108;
   @OriginalMember(
      owner = "client!tha",
      name = "N",
      descriptor = "[I"
   )
   private int[] field7111;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field7115;
         if (~arg2 == -1) {
            this.field7116 = arg1.method603(-2);
         }

         if (arg0 > -34) {
            this.field7111 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7118[8] + arg0 + ',' + (arg1 != null ? field7118[7] : field7118[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "i",
      descriptor = "(I)I"
   )
   public static final int method3849(int arg0) {
      try {
         ++field7105;
         return arg0 != 17 ? 84 : class323.field4426;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7118[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7117;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            method3851((byte)-60);
         }

         if (super.field926.field5048) {
            int var5 = (~class99.field1313 == ~this.field7109 ? arg1 : this.field7109 * arg1 / class99.field1313) * this.field7112;
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            if (class262.field3328 == this.field7112) {
               int var9 = 0;
               if (var3 || ~class262.field3328 < ~var9) {
                  do {
                     int var10 = this.field7111[var5++];
                     var8[var9] = class109.method974(255, var10) << 4;
                     var7[var9] = class109.method974(var10, 65280) >> 4;
                     var6[var9] = class109.method974(var10, 16711680) >> 12;
                     ++var9;
                  } while(~class262.field3328 < ~var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || class262.field3328 > var11) {
               do {
                  int var12 = this.field7112 * var11 / class262.field3328;
                  int var13 = this.field7111[var5 + var12];
                  var8[var11] = class109.method974(4080, var13 << 4);
                  var7[var11] = class109.method974(65280, var13) >> 4;
                  var6[var11] = class109.method974(var13 >> 12, 4080);
                  ++var11;
               } while(class262.field3328 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field7118[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method688(boolean arg0) {
      try {
         super.method688(arg0);
         ++field7113;
         this.field7111 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7118[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "d",
      descriptor = "(III)V"
   )
   public static final void method3850(int arg0, int arg1, int arg2) {
      try {
         ++field7106;
         if (arg1 > 104) {
            class487 var3 = class2.method12((long)arg2, 17, (byte)43);
            var3.method3694(-21792);
            var3.field6794 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7118[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3851(byte arg0) {
      try {
         field7108 = null;
         if (arg0 != 56) {
            method3849(122);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7118[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "j",
      descriptor = "(I)Z"
   )
   public static final boolean method3852(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field7110;
         class150 var2 = (class150)class47.field593.method288(0);
         if (var2 == null) {
            return false;
         } else {
            int var3 = 0;
            if (arg0 >= -55) {
               field7108 = null;
               if (var1) {
                  if (var2.field1876[var3] != null && ~var2.field1876[var3].field11210 == -1) {
                     return false;
                  }

                  if (var2.field1868[var3] != null) {
                     if (var2.field1868[var3].field11210 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }
            }

            while(true) {
               while(~var3 > ~var2.field1875) {
                  if (var2.field1876[var3] != null && ~var2.field1876[var3].field11210 == -1) {
                     return false;
                  }

                  if (var2.field1868[var3] != null) {
                     if (var2.field1868[var3].field11210 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (!var1) {
                  return true;
               }

               if (false) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7118[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method693(int arg0, int arg1, int arg2) {
      try {
         super.method693(arg0, arg1, arg2);
         ++field7114;
         if (~this.field7116 <= -1 && class593.field8747 != null) {
            int var4 = !class593.field8747.method911(this.field7116, -119).field9901 ? 128 : 64;
            this.field7111 = class593.field8747.method913(var4, this.field7116, false, 75, 1.0F, var4);
            this.field7112 = var4;
            this.field7109 = var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7118[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "<init>",
      descriptor = "()V"
   )
   public class510() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method687(int arg0) {
      try {
         if (arg0 != 0) {
            this.field7111 = null;
         }

         ++field7107;
         return this.field7116;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7118[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3853(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3854(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
