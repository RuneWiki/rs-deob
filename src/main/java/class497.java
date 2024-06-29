import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class497 {
   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "[Lpga;"
   )
   private class371[] field7081;
   @OriginalMember(
      owner = "client!qc",
      name = "g",
      descriptor = "[Lpga;"
   )
   public class371[] field7085;
   @OriginalMember(
      owner = "client!qc",
      name = "k",
      descriptor = "Laga;"
   )
   public class145 field7083;
   @OriginalMember(
      owner = "client!qc",
      name = "j",
      descriptor = "Laga;"
   )
   public class145 field7088;
   @OriginalMember(
      owner = "client!qc",
      name = "f",
      descriptor = "Ldaa;"
   )
   private class226 field7082;
   @OriginalMember(
      owner = "client!qc",
      name = "h",
      descriptor = "Z"
   )
   public boolean field7090;
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7092 = new String[]{method3774(method3773("Gk90u")), method3774(method3773("Gk92u")), method3774(method3773("Gk97u")), method3774(method3773("M&9] ")), method3774(method3773("Gk9O4XacMu")), method3774(method3773("X}{\u001f")), method3774(method3773("Gk91u"))};
   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field7089 = new class724(68, -1);
   @OriginalMember(
      owner = "client!qc",
      name = "i",
      descriptor = "D"
   )
   public static double field7091;
   @OriginalMember(
      owner = "client!qc",
      name = "e",
      descriptor = "I"
   )
   public static int field7084;
   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "I"
   )
   public static int field7086;
   @OriginalMember(
      owner = "client!qc",
      name = "d",
      descriptor = "I"
   )
   public static int field7087;

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3769(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field7084;
         if (class548.field7815 != null) {
            int var2 = 0;
            if (var1) {
               class548.field7815[var2] = null;
               ++var2;
            }

            while(true) {
               while(class517.field7317 > var2) {
                  class548.field7815[var2] = null;
                  ++var2;
               }

               if (!var1) {
                  class548.field7815 = null;
                  break;
               }

               ++var2;
            }
         }

         if (class130.field2084 != null) {
            int var3 = 0;
            if (var1) {
               class130.field2084[var3] = null;
               ++var3;
            }

            while(true) {
               while(~class29.field421 < ~var3) {
                  class130.field2084[var3] = null;
                  ++var3;
               }

               if (!var1) {
                  class130.field2084 = null;
                  break;
               }

               ++var3;
            }
         }

         if (class114.field1804 != null) {
            int var4 = 0;
            if (var1) {
               class114.field1804[var4] = null;
               ++var4;
            }

            while(true) {
               while(class229.field3566 > var4) {
                  class114.field1804[var4] = null;
                  ++var4;
               }

               if (!var1) {
                  class114.field1804 = null;
                  break;
               }

               ++var4;
            }
         }

         class595.field8383 = null;
         class358.field5300 = -1;
         class597.field8402 = -1;
         class411.field6030 = null;
         if (arg0 >= -36) {
            method3772(9);
         }

         class774.field11262 = null;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7092[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method3770(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (this.field7088 == null) {
            if (class503.field7174 == null) {
               byte[] var3 = class207.method1784(4.0F, 128, 16.0F, 4.0F, new class679(419684), 8, 0.6F, -31506, 0.5F, 16, 128);
               class503.field7174 = class393.method3047(1, false, var3);
            }

            byte[] var4 = class614.method4514(class503.field7174, false, false);
            byte[] var5 = new byte[var4.length * 4];
            int var6 = 0;
            int var7 = 0;
            if (var2 || ~var7 > -17) {
               do {
                  int var8 = var7 * 128 * 128;
                  int var9 = var8;
                  int var10 = 0;
                  if (var2 || var10 < 128) {
                     do {
                        int var11 = var10 * 128 + var9;
                        int var12 = (var10 + -1 & 127) * 128 + var9;
                        int var13 = (var10 - -1 & 127) * 128 + var9;
                        int var14 = 0;
                        if (var2 || ~var14 > -129) {
                           do {
                              float var15 = (float)((var4[var12 + var14] & 255) - (var4[var13 + var14] & 255));
                              float var16 = (float)((255 & var4[(var14 + -1 & 127) + var11]) + -(var4[(127 & var14 + 1) + var11] & 255));
                              float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                              var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                              var5[var6++] = (byte)((int)(var17 * 128.0F + 127.0F));
                              var5[var6++] = (byte)((int)(var15 * var17 + 127.0F));
                              var5[var6++] = var4[var8++];
                              ++var14;
                           } while(~var14 > -129);
                        }

                        ++var10;
                     } while(var10 < 128);
                  }

                  ++var7;
               } while(~var7 > -17);
            }

            this.field7088 = this.field7082.method1248(class31.field438, (byte)88, 128, var5, 16, 128);
         }

         ++field7086;
         int var18 = 91 % ((-43 - arg0) / 46);
         return this.field7088 != null;
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field7092[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method3771(boolean arg0) {
      try {
         ++field7087;
         if (!arg0) {
            this.field7082 = null;
         }

         if (!this.field7090) {
            return this.field7085 != null;
         } else {
            return this.field7083 != null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7092[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3772(int arg0) {
      try {
         if (arg0 != -1) {
            field7089 = null;
         }

         field7089 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7092[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class497(class226 arg0) {
      boolean var2 = client.field10022;
      super();
      this.field7081 = null;
      this.field7085 = null;
      this.field7083 = null;
      this.field7088 = null;

      try {
         this.field7082 = arg0;
         this.field7090 = this.field7082.field3406;
         if (this.field7090 && !this.field7082.method1278(class73.field1175, class779.field11371, 104)) {
            this.field7090 = false;
         }

         if (this.field7090 || this.field7082.method1229(0, class73.field1175, class779.field11371)) {
            class692.method5026(16);
            if (this.field7090) {
               byte[] var7 = class614.method4514(class797.field11593, false, false);
               this.field7083 = this.field7082.method1248(class73.field1175, (byte)61, 128, var7, 16, 128);
               byte[] var8 = class614.method4514(class193.field2802, false, false);
               this.field7082.method1248(class73.field1175, (byte)119, 128, var8, 16, 128);
            } else {
               Object var10000;
               short var10001;
               label56: {
                  this.field7085 = new class371[16];
                  int var3 = 0;
                  if (var2) {
                     var10000 = class797.field11593;
                     var10001 = -23419;
                  } else if (~var3 <= -17) {
                     var10000 = this;
                     var10001 = 16;
                     if (!var2) {
                        break label56;
                     }
                  } else {
                     var10000 = class797.field11593;
                     var10001 = -23419;
                  }

                  while(true) {
                     byte[] var4 = class521.method3888(var10000, var10001, 32768, var3 * 2 * 16384);
                     this.field7085[var3] = this.field7082.method1997(var4, class73.field1175, 128, 128, 0, true);
                     ++var3;
                     if (~var3 <= -17) {
                        var10000 = this;
                        var10001 = 16;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var10000 = class797.field11593;
                        var10001 = -23419;
                     }
                  }
               }

               ((class497)var10000).field7081 = new class371[var10001];
               int var5 = 0;
               if (var2 || ~var5 > -17) {
                  do {
                     byte[] var6 = class521.method3888(class193.field2802, -23419, 32768, var5 * 128 * 128 * 2);
                     this.field7081[var5] = this.field7082.method1997(var6, class73.field1175, 128, 128, 0, true);
                     ++var5;
                  } while(~var5 > -17);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7092[4] + (arg0 != null ? field7092[3] : field7092[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3773(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3774(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
