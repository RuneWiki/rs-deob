import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class362 {
   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5354 = new String[]{method2851(method2850("U\u001c98/")), method2851(method2850("U\u001c9=/")), method2851(method2850("XZ9Rz")), method2851(method2850("M\u0001{\u0010")), method2851(method2850("U\u001c9?/")), method2851(method2850("U\u001c99/")), method2851(method2850("U\u001c9>/"))};
   @OriginalMember(
      owner = "client!vh",
      name = "f",
      descriptor = "I"
   )
   public static int field5351 = 0;
   @OriginalMember(
      owner = "client!vh",
      name = "g",
      descriptor = "I"
   )
   public static int field5345;
   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "I"
   )
   public static int field5346;
   @OriginalMember(
      owner = "client!vh",
      name = "e",
      descriptor = "I"
   )
   public static int field5347;
   @OriginalMember(
      owner = "client!vh",
      name = "h",
      descriptor = "I"
   )
   public static int field5348;
   @OriginalMember(
      owner = "client!vh",
      name = "i",
      descriptor = "I"
   )
   public static int field5349;
   @OriginalMember(
      owner = "client!vh",
      name = "c",
      descriptor = "I"
   )
   private int field5350;
   @OriginalMember(
      owner = "client!vh",
      name = "d",
      descriptor = "I"
   )
   public static int field5352;
   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "I"
   )
   public int field5353;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(Lsa;IIB)Leca;"
   )
   public static final class590 method2845(class39 arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field5349;
         if (arg3 > -101) {
            field5351 = -127;
         }

         byte[] var4 = arg0.method460((byte)-11, arg2, arg1);
         return var4 == null ? null : new class590(var4);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5354[4] + (arg0 != null ? field5354[2] : field5354[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method2846(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field5345;
         int var6 = this.field5350;
         if (this.field5353 == arg2 && ~this.field5350 == -1) {
            return false;
         } else {
            boolean var7;
            label153: {
               if (this.field5350 == 0) {
                  if (arg2 > this.field5353 && ~(this.field5353 + arg3) <= ~arg2 || ~arg2 > ~this.field5353 && -arg3 + this.field5353 <= arg2) {
                     this.field5353 = arg2;
                     return false;
                  }

                  var7 = true;
                  if (!var5) {
                     break label153;
                  }
               }

               if (~this.field5350 < -1 && ~this.field5353 > ~arg2) {
                  int var8 = this.field5350 * this.field5350 / (arg3 * 2);
                  int var9 = this.field5353 + var8;
                  if (~var9 > ~arg2 && ~var9 <= ~this.field5353) {
                     var7 = true;
                     if (!var5) {
                        break label153;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label153;
                  }
               }

               if (this.field5350 < 0 && ~this.field5353 < ~arg2) {
                  int var10 = this.field5350 * this.field5350 / (arg3 * 2);
                  int var11 = this.field5353 - var10;
                  if (~arg2 > ~var11 && ~var11 >= ~this.field5353) {
                     var7 = true;
                     if (!var5) {
                        break label153;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label153;
                  }
               }

               var7 = false;
            }

            if (arg0 != -9760) {
               return true;
            } else {
               label155: {
                  if (!var7) {
                     if (~this.field5350 < -1) {
                        this.field5350 -= arg3;
                        if (this.field5350 >= 0) {
                           break label155;
                        }

                        this.field5350 = 0;
                        if (!var5) {
                           break label155;
                        }
                     }

                     this.field5350 += arg3;
                     if (~this.field5350 >= -1) {
                        break label155;
                     }

                     this.field5350 = 0;
                     if (!var5) {
                        break label155;
                     }
                  }

                  label102: {
                     if (~this.field5353 <= ~arg2) {
                        this.field5350 -= arg3;
                        if (arg1 == 0 || this.field5350 >= -arg1) {
                           break label102;
                        }

                        this.field5350 = -arg1;
                        if (!var5) {
                           break label102;
                        }
                     }

                     this.field5350 += arg3;
                     if (arg1 != 0 && ~this.field5350 < ~arg1) {
                        this.field5350 = arg1;
                     }
                  }

                  if (~this.field5350 != ~var6) {
                     label93: {
                        int var12 = this.field5350 * this.field5350 / (arg3 * 2);
                        if (this.field5353 >= arg2) {
                           if (~this.field5353 >= ~arg2 || this.field5353 - var12 >= arg2) {
                              break label93;
                           }

                           this.field5350 = var6;
                           if (!var5) {
                              break label93;
                           }
                        }

                        if (this.field5353 - -var12 > arg2) {
                           this.field5350 = var6;
                        }
                     }
                  }
               }

               this.field5353 += this.field5350 + var6 >> 1;
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field5354[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2847(int arg0, int arg1) {
      try {
         this.field5350 = 0;
         this.field5353 = arg0;
         ++field5348;
         if (arg1 < 37) {
            this.field5353 = -82;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5354[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2848(int arg0) {
      try {
         int var2 = 97 / ((arg0 - -69) / 41);
         this.field5353 &= 16383;
         ++field5352;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5354[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2849(boolean arg0) {
      try {
         if (!arg0) {
            return 91;
         } else {
            ++field5347;
            return this.field5353 & 16383;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5354[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
