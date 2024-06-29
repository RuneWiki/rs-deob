import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class626 extends class247 {
   @OriginalMember(
      owner = "client!ao",
      name = "q",
      descriptor = "I"
   )
   public int field8944;
   @OriginalMember(
      owner = "client!ao",
      name = "o",
      descriptor = "I"
   )
   public int field8941;
   @OriginalMember(
      owner = "client!ao",
      name = "l",
      descriptor = "[Z"
   )
   public boolean[] field8940;
   @OriginalMember(
      owner = "client!ao",
      name = "j",
      descriptor = "[[I"
   )
   public int[][] field8937;
   @OriginalMember(
      owner = "client!ao",
      name = "p",
      descriptor = "[I"
   )
   public int[] field8938;
   @OriginalMember(
      owner = "client!ao",
      name = "m",
      descriptor = "[I"
   )
   public int[] field8943;
   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8945 = new String[]{method4609(method4608("[c,x")), method4609(method4608("N8n:N")), method4609(method4608("Tyn(Z[\u007f4*\u001b")), method4609(method4608("TynW\u001b")), method4609(method4608("TynV\u001b")), method4609(method4608("\u0015Q\r@")), method4609(method4608("\u00196")), method4609(method4608("TynU\u001b"))};
   @OriginalMember(
      owner = "client!ao",
      name = "k",
      descriptor = "I"
   )
   public static int field8936;
   @OriginalMember(
      owner = "client!ao",
      name = "r",
      descriptor = "I"
   )
   public static int field8939;
   @OriginalMember(
      owner = "client!ao",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field8942;

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4605(boolean arg0) {
      try {
         if (!arg0) {
            field8942 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8945[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IJ)Ljava/lang/String;"
   )
   public static final String method4606(int arg0, long arg1) {
      try {
         ++field8936;
         class443.field6475.setTime(new Date(arg1));
         int var3 = class443.field6475.get(7);
         int var4 = class443.field6475.get(5);
         int var5 = class443.field6475.get(2);
         int var6 = class443.field6475.get(1);
         if (arg0 >= -66) {
            method4606(-7, -30L);
         }

         int var7 = class443.field6475.get(11);
         int var8 = class443.field6475.get(12);
         int var9 = class443.field6475.get(13);
         return class494.field7042[var3 + -1] + field8945[6] + var4 / 10 + var4 % 10 + "-" + class712.field10225[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + field8945[5];
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8945[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IILeu;Lmj;BIIIIIII)V"
   )
   public static final void method4607(int arg0, int arg1, class634 arg2, class730 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         class546.field7780 = arg6;
         class169.field2528 = arg5;
         class587.field8244 = null;
         class467.field6772 = arg9;
         class684.field9884 = arg8;
         ++field8939;
         class536.field7531 = arg0;
         if (arg4 >= -108) {
            field8942 = null;
         }

         class411.field6045 = arg7;
         class283.field4280 = arg11;
         class325.field4833 = null;
         class633.field8982 = arg10;
         class319.field4769 = null;
         class678.field9661 = arg3;
         class137.field2206 = arg2;
         class615.field8754 = arg1;
         class72.method815(1);
         class70.field1029 = true;
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8945[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8945[1] : field8945[0]) + ',' + (arg3 != null ? field8945[1] : field8945[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "<init>",
      descriptor = "(I[B)V"
   )
   public class626(int arg0, byte[] arg1) {
      boolean var3 = client.field10022;
      super();

      try {
         this.field8944 = arg0;
         class65 var4 = new class65(arg1);
         this.field8941 = var4.method665(false);
         this.field8940 = new boolean[this.field8941];
         this.field8937 = new int[this.field8941][];
         this.field8938 = new int[this.field8941];
         this.field8943 = new int[this.field8941];
         int var5 = 0;
         if (var3) {
            this.field8943[var5] = var4.method665(false);
            if (~this.field8943[var5] == -7) {
               this.field8943[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (this.field8941 <= var5) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field8940[var6] = ~var4.method665(false) == -2;
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > ~this.field8941) {
                        this.field8940[var6] = ~var4.method665(false) == -2;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field8938[var7] = var4.method685(-2);
                           ++var7;
                        }

                        while(true) {
                           while(var7 < this.field8941) {
                              this.field8938[var7] = var4.method685(-2);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field8937[var8] = new int[var4.method665(false)];
                                 ++var8;
                              }

                              while(true) {
                                 while(~var8 > ~this.field8941) {
                                    this.field8937[var8] = new int[var4.method665(false)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && this.field8941 <= var9) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field8937[var9][var10] = var4.method665(false);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field8937[var9].length > var10) {
                                             this.field8937[var9][var10] = var4.method665(false);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(this.field8941 > var9);

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
               this.field8943[var5] = var4.method665(false);
            }

            if (~this.field8943[var5] == -7) {
               this.field8943[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field8945[2] + arg0 + ',' + (arg1 != null ? field8945[1] : field8945[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4609(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
