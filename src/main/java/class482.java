import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class482 {
   @OriginalMember(
      owner = "client!wr",
      name = "j",
      descriptor = "Ldka;"
   )
   public class13 field7150;
   @OriginalMember(
      owner = "client!wr",
      name = "k",
      descriptor = "[Loia;"
   )
   private class95[] field7151;
   @OriginalMember(
      owner = "client!wr",
      name = "d",
      descriptor = "Ldka;"
   )
   public class13 field7155;
   @OriginalMember(
      owner = "client!wr",
      name = "g",
      descriptor = "[Loia;"
   )
   public class95[] field7153;
   @OriginalMember(
      owner = "client!wr",
      name = "h",
      descriptor = "Ldh;"
   )
   private class338 field7161;
   @OriginalMember(
      owner = "client!wr",
      name = "c",
      descriptor = "Z"
   )
   public boolean field7152;
   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7163 = new String[]{method3581(method3580("rTC@ ")), method3581(method3580("FG\u000f`ibC")), method3581(method3580("~\bC,u")), method3581(method3580("kS\u0001n")), method3581(method3580("rTCG ")), method3581(method3580("rTCA ")), method3581(method3580("rTC>akO\u0019< ")), method3581(method3580("rTCF ")), method3581(method3580("rTCC "))};
   @OriginalMember(
      owner = "client!wr",
      name = "e",
      descriptor = "[Z"
   )
   public static boolean[] field7157 = new boolean[100];
   @OriginalMember(
      owner = "client!wr",
      name = "f",
      descriptor = "D"
   )
   public static double field7154;
   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "I"
   )
   public static int field7156;
   @OriginalMember(
      owner = "client!wr",
      name = "m",
      descriptor = "I"
   )
   public static int field7158;
   @OriginalMember(
      owner = "client!wr",
      name = "i",
      descriptor = "I"
   )
   public static int field7159;
   @OriginalMember(
      owner = "client!wr",
      name = "l",
      descriptor = "I"
   )
   public static int field7160;
   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "Lpg;"
   )
   public static class763 field7162;

   @OriginalMember(
      owner = "client!wr",
      name = "<init>",
      descriptor = "(Ldh;)V",
      line = 164
   )
   public class482(class338 arg0) {
      int var2 = client.field4530;
      super();
      this.field7150 = null;
      this.field7151 = null;
      this.field7155 = null;
      this.field7153 = null;

      try {
         this.field7161 = arg0;
         this.field7152 = this.field7161.field5019;
         if (this.field7152 && !this.field7161.method2591(5395, class513.field7519, class158.field2002)) {
            this.field7152 = false;
         }

         if (this.field7152 || this.field7161.method2597(class513.field7519, class158.field2002, (byte)-109)) {
            class667.method4785((byte)-43);
            if (this.field7152) {
               byte[] var3 = class500.method3731((byte)86, false, class687.field10346);
               this.field7155 = this.field7161.method2615(var3, 16, 128, 128, class158.field2002, 512);
               byte[] var4 = class500.method3731((byte)-102, false, class236.field2996);
               this.field7161.method2615(var4, 16, 128, 128, class158.field2002, 512);
            } else {
               Object var10000;
               int var10001;
               label55: {
                  this.field7153 = new class95[16];
                  int var5 = 0;
                  if (var2 != 0) {
                     var10000 = class687.field10346;
                     var10001 = 32768;
                  } else if (~var5 <= -17) {
                     var10000 = this;
                     var10001 = 16;
                     if (var2 == 0) {
                        break label55;
                     }
                  } else {
                     var10000 = class687.field10346;
                     var10001 = 32768;
                  }

                  while(true) {
                     byte[] var6 = class10.method86(var10000, var10001, var5 * 256 * 128, (byte)123);
                     this.field7153[var5] = this.field7161.method2671(128, class158.field2002, 13197, 128, true, var6);
                     ++var5;
                     if (~var5 <= -17) {
                        var10000 = this;
                        var10001 = 16;
                        if (var2 == 0) {
                           break;
                        }
                     } else {
                        var10000 = class687.field10346;
                        var10001 = 32768;
                     }
                  }
               }

               ((class482)var10000).field7151 = new class95[var10001];
               int var7 = 0;
               if (var2 != 0 || var7 < 16) {
                  do {
                     byte[] var8 = class10.method86(class236.field2996, 32768, var7 * 256 * 128, (byte)109);
                     this.field7151[var7] = this.field7161.method2671(128, class158.field2002, 13197, 128, true, var8);
                     ++var7;
                  } while(var7 < 16);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7163[6] + (arg0 != null ? field7163[2] : field7163[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Z)Z",
      line = 11
   )
   public final boolean method3575(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field7160;
         if (this.field7150 == null) {
            if (class339.field5138 == null) {
               byte[] var3 = class487.method3610(128, 2, 4.0F, new class322(419684), 8, 16, 0.5F, 16.0F, 0.6F, 128, 4.0F);
               class339.field5138 = class756.method5493(var3, -96, false);
            }

            byte[] var4 = class500.method3731((byte)98, false, class339.field5138);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            int var7 = 0;
            if (var2 != 0 || ~var7 > -17) {
               do {
                  int var8 = var7 * 128 * 128;
                  int var9 = var8;
                  int var10 = 0;
                  if (var2 != 0 || ~var10 > -129) {
                     do {
                        int var11 = var9 - -(var10 * 128);
                        int var12 = var9 - -((var10 + -1 & 127) * 128);
                        int var13 = (var10 + 1 & 127) * 128 + var9;
                        int var14 = 0;
                        if (var2 != 0 || ~var14 > -129) {
                           do {
                              float var15 = (float)((var4[var12 + var14] & 255) + -(var4[var13 + var14] & 255));
                              float var16 = (float)((255 & var4[(127 & var14 + -1) + var11]) - (var4[(127 & var14 + 1) + var11] & 255));
                              float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                              var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                              var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                              var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                              var5[var6++] = var4[var8++];
                              ++var14;
                           } while(~var14 > -129);
                        }

                        ++var10;
                     } while(~var10 > -129);
                  }

                  ++var7;
               } while(~var7 > -17);
            }

            this.field7150 = this.field7161.method2615(var5, 16, 128, 128, class75.field963, 512);
         }

         if (arg0) {
            this.field7151 = null;
         }

         return this.field7150 != null;
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field7163[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Ljj;IB)Ljava/lang/String;",
      line = 92
   )
   public static final String method3576(class128 arg0, int arg1, byte arg2) {
      try {
         ++field7158;

         try {
            int var3 = arg0.method1061((byte)60);
            if (~var3 < ~arg1) {
               var3 = arg1;
            }

            byte[] var4 = new byte[var3];
            if (arg2 != -122) {
               field7157 = null;
            }

            arg0.field1590 += class175.field2175.method108(-24095, arg0.field1590, var4, arg0.field1552, var3, 0);
            return class29.method207(var3, 0, var4, arg2 ^ -122);
         } catch (Exception var7) {
            return field7163[1];
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7163[4] + (arg0 != null ? field7163[2] : field7163[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(I)V",
      line = 122
   )
   public static void method3577(int arg0) {
      try {
         field7162 = null;
         int var1 = -70 / ((arg0 - -33) / 49);
         field7157 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7163[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;",
      line = 133
   )
   public static final String method3578(int arg0, int arg1, long arg2) {
      try {
         if (arg1 < 49) {
            method3578(5, 21, 106L);
         }

         ++field7156;
         class500.method3735(arg2, (byte)-92);
         int var4 = class447.field6798.get(5);
         int var5 = 1 + class447.field6798.get(2);
         int var6 = class447.field6798.get(1);
         return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7163[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "b",
      descriptor = "(I)Z",
      line = 223
   )
   public final boolean method3579(int arg0) {
      try {
         ++field7159;
         if (arg0 != 2) {
            method3577(114);
         }

         if (!this.field7152) {
            return this.field7153 != null;
         } else {
            return this.field7155 != null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7163[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3580(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3581(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
