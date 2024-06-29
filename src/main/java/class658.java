import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class658 extends class22 {
   @OriginalMember(
      owner = "client!jk",
      name = "k",
      descriptor = "I"
   )
   public int field9601;
   @OriginalMember(
      owner = "client!jk",
      name = "o",
      descriptor = "I"
   )
   public int field9603;
   @OriginalMember(
      owner = "client!jk",
      name = "j",
      descriptor = "[[I"
   )
   public int[][] field9602;
   @OriginalMember(
      owner = "client!jk",
      name = "n",
      descriptor = "[Z"
   )
   public boolean[] field9604;
   @OriginalMember(
      owner = "client!jk",
      name = "m",
      descriptor = "[I"
   )
   public int[] field9597;
   @OriginalMember(
      owner = "client!jk",
      name = "l",
      descriptor = "[I"
   )
   public int[] field9598;
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9605 = new String[]{method4836(method4835("oT\u0010V/")), method4836(method4835("kJRx")), method4836(method4835("~\u0011\u0010:z")), method4836(method4835("oT\u0010(nkVJ*/")), method4836(method4835("oT\u0010U/"))};
   @OriginalMember(
      owner = "client!jk",
      name = "q",
      descriptor = "Ltga;"
   )
   public static class63 field9600 = class729.method5268((byte)120);
   @OriginalMember(
      owner = "client!jk",
      name = "p",
      descriptor = "I"
   )
   public static int field9599;

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Ljfa;BII)V",
      line = 14
   )
   public static final void method4833(class303 arg0, byte arg1, int arg2, int arg3) {
      try {
         class211.field3155 = arg3;
         ++field9599;
         int var4 = -99 / ((6 - arg1) / 48);
         class470.field6834 = arg0;
         class151.field2420 = arg2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9605[0] + (arg0 != null ? field9605[2] : field9605[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(B)V",
      line = 26
   )
   public static void method4834(byte arg0) {
      try {
         field9600 = null;
         if (arg0 != -53) {
            method4834((byte)-23);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9605[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "<init>",
      descriptor = "(I[B)V",
      line = 37
   )
   public class658(int arg0, byte[] arg1) {
      boolean var3 = client.field4564;
      super();

      try {
         this.field9601 = arg0;
         class473 var4 = new class473(arg1);
         this.field9603 = var4.method3564((byte)-106);
         this.field9602 = new int[this.field9603][];
         this.field9604 = new boolean[this.field9603];
         this.field9597 = new int[this.field9603];
         this.field9598 = new int[this.field9603];
         int var5 = 0;
         if (var3) {
            this.field9597[var5] = var4.method3564((byte)-98);
            if (this.field9597[var5] == 6) {
               this.field9597[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (~this.field9603 >= ~var5) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field9604[var6] = var4.method3564((byte)-41) == 1;
                     ++var6;
                  }

                  while(true) {
                     while(this.field9603 > var6) {
                        this.field9604[var6] = var4.method3564((byte)-41) == 1;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field9598[var7] = var4.method3565(true);
                           ++var7;
                        }

                        while(true) {
                           while(~var7 > ~this.field9603) {
                              this.field9598[var7] = var4.method3565(true);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field9602[var8] = new int[var4.method3564((byte)-107)];
                                 ++var8;
                              }

                              while(true) {
                                 while(~var8 > ~this.field9603) {
                                    this.field9602[var8] = new int[var4.method3564((byte)-107)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && ~this.field9603 >= ~var9) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field9602[var9][var10] = var4.method3564((byte)-63);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field9602[var9].length > var10) {
                                             this.field9602[var9][var10] = var4.method3564((byte)-63);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(~this.field9603 < ~var9);

                                    return;
                                 }

                                 ++var8;
                              }
                           }

                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }
            } else {
               this.field9597[var5] = var4.method3564((byte)-98);
            }

            if (this.field9597[var5] == 6) {
               this.field9597[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field9605[3] + arg0 + ',' + (arg1 != null ? field9605[2] : field9605[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4835(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4836(char[] arg0) {
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
            var10005 = 63;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
