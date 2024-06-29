import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class759 extends class70 {
   @OriginalMember(
      owner = "client!cm",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11184 = new String[]{method5510(method5509(")tK}Y")), method5510(method5509(")tK~Y")), method5510(method5509("$l\t_")), method5510(method5509("17K\u001d\f")), method5510(method5509(")tK\u007fY")), method5510(method5509(")tKxY")), method5510(method5509(")tKyY")), method5510(method5509(")tKzY"))};
   @OriginalMember(
      owner = "client!cm",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field11182 = false;
   @OriginalMember(
      owner = "client!cm",
      name = "D",
      descriptor = "I"
   )
   public static int field11172;
   @OriginalMember(
      owner = "client!cm",
      name = "E",
      descriptor = "I"
   )
   public static int field11175;
   @OriginalMember(
      owner = "client!cm",
      name = "B",
      descriptor = "I"
   )
   public static int field11177;
   @OriginalMember(
      owner = "client!cm",
      name = "H",
      descriptor = "I"
   )
   public static int field11179;
   @OriginalMember(
      owner = "client!cm",
      name = "I",
      descriptor = "I"
   )
   public static int field11181;
   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "Lik;"
   )
   public static class219 field11174;
   @OriginalMember(
      owner = "client!cm",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public String field11183;
   @OriginalMember(
      owner = "client!cm",
      name = "F",
      descriptor = "[C"
   )
   public char[] field11176;
   @OriginalMember(
      owner = "client!cm",
      name = "C",
      descriptor = "[C"
   )
   public char[] field11178;
   @OriginalMember(
      owner = "client!cm",
      name = "G",
      descriptor = "[I"
   )
   public int[] field11173;
   @OriginalMember(
      owner = "client!cm",
      name = "A",
      descriptor = "[I"
   )
   public int[] field11180;

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public final void method5503(int arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         int var4 = -125 % ((arg0 - -2) / 55);
         ++field11179;

         do {
            int var5 = arg1.method1104(255);
            if (~var5 == -1) {
               break;
            }

            this.method5508((byte)73, var5, arg1);
         } while(var3 == 0);

      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11184[6] + arg0 + ',' + (arg1 != null ? field11184[3] : field11184[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(CB)I"
   )
   public final int method5504(char arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 >= -15) {
            this.method5504('\u001e', (byte)-96);
         }

         ++field11177;
         if (this.field11180 == null) {
            return -1;
         } else {
            int var4 = 0;
            int var10000;
            if (var3 != 0) {
               var10000 = ~arg0;
            } else if (var4 >= this.field11180.length) {
               var10000 = -1;
               if (var3 == 0) {
                  return -1;
               }
            } else {
               var10000 = ~arg0;
            }

            while(var10000 != ~this.field11178[var4]) {
               ++var4;
               if (var4 >= this.field11180.length) {
                  var10000 = -1;
                  if (var3 == 0) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg0;
               }
            }

            return this.field11180[var4];
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11184[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5505(int arg0) {
      try {
         field11174 = null;
         if (arg0 != 0) {
            field11182 = false;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11184[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BC)I"
   )
   public final int method5506(byte arg0, char arg1) {
      int var3 = client.field4530;

      try {
         ++field11172;
         if (this.field11173 == null) {
            return -1;
         } else {
            if (arg0 >= -19) {
               this.method5506((byte)77, (char)65488);
            }

            int var4 = 0;
            if (var3 != 0) {
               if (this.field11176[var4] == arg1) {
                  return this.field11173[var4];
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (var4 >= this.field11173.length) {
                  var10000 = -1;
                  if (var3 == 0) {
                     return -1;
                  }
               } else {
                  var10000 = this.field11176[var4];
               }

               if (var10000 == arg1) {
                  return this.field11173[var4];
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11184[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method5507(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cm",
      name = "a",
      descriptor = "(BILjj;)V"
   )
   private final void method5508(byte arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label102: {
            if (~arg1 != -2) {
               if (arg1 == 2) {
                  int var5 = arg2.method1104(255);
                  this.field11178 = new char[var5];
                  this.field11180 = new int[var5];
                  int var6 = 0;
                  byte var7;
                  if (var4 != 0) {
                     this.field11180[var6] = arg2.method1038((byte)-96);
                     var7 = arg2.method1047((byte)-123);
                     this.field11178[var6] = ~var7 == -1 ? 0 : class296.method2252(var7, 0);
                     ++var6;
                  }

                  while(true) {
                     if (~var5 >= ~var6) {
                        if (var4 == 0) {
                           if (var4 == 0) {
                              break label102;
                           }
                           break;
                        }
                     } else {
                        this.field11180[var6] = arg2.method1038((byte)-96);
                     }

                     var7 = arg2.method1047((byte)-123);
                     this.field11178[var6] = ~var7 == -1 ? 0 : class296.method2252(var7, 0);
                     ++var6;
                  }
               }

               if (arg1 != 3) {
                  break label102;
               }

               int var8 = arg2.method1104(arg0 ^ 182);
               this.field11173 = new int[var8];
               this.field11176 = new char[var8];
               int var9 = 0;
               byte var10;
               if (var4 != 0) {
                  this.field11173[var9] = arg2.method1038((byte)-117);
                  var10 = arg2.method1047((byte)-127);
                  this.field11176[var9] = var10 == 0 ? 0 : class296.method2252(var10, 0);
                  ++var9;
               }

               while(true) {
                  if (~var8 >= ~var9) {
                     if (var4 == 0) {
                        if (var4 == 0) {
                           break label102;
                        }
                        break;
                     }
                  } else {
                     this.field11173[var9] = arg2.method1038((byte)-117);
                  }

                  var10 = arg2.method1047((byte)-127);
                  this.field11176[var9] = var10 == 0 ? 0 : class296.method2252(var10, 0);
                  ++var9;
               }
            }

            this.field11183 = arg2.method1083((byte)58);
         }

         ++field11175;
         if (arg0 != 73) {
            this.method5506((byte)15, 'B');
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field11184[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11184[3] : field11184[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5509(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5510(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
