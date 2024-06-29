import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class751 extends class70 {
   @OriginalMember(
      owner = "client!qa",
      name = "I",
      descriptor = "I"
   )
   private int field10960 = 1;
   @OriginalMember(
      owner = "client!qa",
      name = "N",
      descriptor = "I"
   )
   private int field10961 = 1;
   @OriginalMember(
      owner = "client!qa",
      name = "K",
      descriptor = "I"
   )
   private int field10962 = 204;
   @OriginalMember(
      owner = "client!qa",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10964 = new String[]{method5433(method5432("k\u0012&\bk")), method5433(method5432("~IdJ")), method5433(method5432("a]&e>")), method5433(method5432("a]&i>")), method5433(method5432("a]&b>"))};
   @OriginalMember(
      owner = "client!qa",
      name = "O",
      descriptor = "Laka;"
   )
   public static class418 field10957 = new class418(73, 28);
   @OriginalMember(
      owner = "client!qa",
      name = "J",
      descriptor = "I"
   )
   public static int field10958;
   @OriginalMember(
      owner = "client!qa",
      name = "M",
      descriptor = "I"
   )
   public static int field10959;
   @OriginalMember(
      owner = "client!qa",
      name = "L",
      descriptor = "I"
   )
   public static int field10963;

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field10958;
         if (arg0 != -63) {
            this.method331((byte)-51, -58);
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = 0;
            if (var3 || var5 < class262.field3328) {
               do {
                  int var6 = class17.field290[var5];
                  int var7 = class502.field6979[arg1];
                  int var8 = this.field10960 * var6 >> 12;
                  int var9 = this.field10961 * var7 >> 12;
                  int var10 = var6 % (4096 / this.field10960) * this.field10960;
                  int var11 = var7 % (4096 / this.field10961) * this.field10961;
                  if (~var11 > ~this.field10962) {
                     var8 -= var9;
                     if (var3) {
                        var8 += 4;
                     }

                     while(~var8 > -1) {
                        var8 += 4;
                     }

                     if (var3) {
                        var8 -= 4;
                     }

                     while(var8 > 3) {
                        var8 -= 4;
                     }

                     if (var8 != 1) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }

                     if (this.field10962 > var10) {
                        var4[var5] = 0;
                        if (!var3) {
                           ++var5;
                           continue;
                        }
                     }
                  }

                  if (~this.field10962 >= ~var10) {
                     var4[var5] = 4096;
                     ++var5;
                  } else {
                     int var12 = var8 - var9;
                     if (var3) {
                        var12 += 4;
                     }

                     while(var12 < 0) {
                        var12 += 4;
                     }

                     if (var3) {
                        var12 -= 4;
                     }

                     while(~var12 < -4) {
                        var12 -= 4;
                     }

                     if (var12 > 0) {
                        var4[var5] = 0;
                        if (var3) {
                           var4[var5] = 4096;
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        var4[var5] = 4096;
                        ++var5;
                     }
                  }
               } while(var5 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field10964[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field10963;
         if (arg0 < -34) {
            if (~arg2 != -1) {
               if (arg2 == 1) {
                  this.field10961 = arg1.method640(255);
                  return;
               }

               if (~arg2 != -3) {
                  return;
               }

               if (!client.field1481) {
                  this.field10962 = arg1.method603(-2);
                  return;
               }
            }

            this.field10960 = arg1.method640(255);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10964[2] + arg0 + ',' + (arg1 != null ? field10964[0] : field10964[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method5431(int arg0) {
      try {
         field10957 = null;
         if (arg0 != 5302) {
            method5431(-50);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10964[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "<init>",
      descriptor = "()V"
   )
   public class751() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
