import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class585 extends class347 {
   @OriginalMember(
      owner = "client!si",
      name = "n",
      descriptor = "I"
   )
   public int field8684;
   @OriginalMember(
      owner = "client!si",
      name = "j",
      descriptor = "I"
   )
   public int field8686;
   @OriginalMember(
      owner = "client!si",
      name = "m",
      descriptor = "[[I"
   )
   public int[][] field8682;
   @OriginalMember(
      owner = "client!si",
      name = "o",
      descriptor = "[I"
   )
   public int[] field8685;
   @OriginalMember(
      owner = "client!si",
      name = "k",
      descriptor = "[Z"
   )
   public boolean[] field8683;
   @OriginalMember(
      owner = "client!si",
      name = "i",
      descriptor = "[I"
   )
   public int[] field8687;
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8688 = new String[]{method4328(method4327(";47*7")), method4328(method4327("3s78#.sm:b")), method4328(method4327(".ouh")), method4328(method4327("3s7Eb"))};
   @OriginalMember(
      owner = "client!si",
      name = "l",
      descriptor = "Ljfa;"
   )
   public static class303 field8681;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(B)V",
      line = 6
   )
   public static void method4326(byte arg0) {
      try {
         if (arg0 > -110) {
            method4326((byte)66);
         }

         field8681 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8688[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "<init>",
      descriptor = "(I[B)V",
      line = 21
   )
   public class585(int arg0, byte[] arg1) {
      int var3 = client.field4530;
      super();

      try {
         this.field8684 = arg0;
         class128 var4 = new class128(arg1);
         this.field8686 = var4.method1104(255);
         this.field8682 = new int[this.field8686][];
         this.field8685 = new int[this.field8686];
         this.field8683 = new boolean[this.field8686];
         this.field8687 = new int[this.field8686];
         int var5 = 0;
         if (var3 != 0) {
            this.field8687[var5] = var4.method1104(255);
            if (this.field8687[var5] == 6) {
               this.field8687[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (var5 >= this.field8686) {
               int var6 = 0;
               if (var3 == 0) {
                  if (var3 != 0) {
                     this.field8683[var6] = ~var4.method1104(255) == -2;
                     ++var6;
                  }

                  while(true) {
                     while(~this.field8686 < ~var6) {
                        this.field8683[var6] = ~var4.method1104(255) == -2;
                        ++var6;
                     }

                     int var7 = 0;
                     if (var3 == 0) {
                        if (var3 != 0) {
                           this.field8685[var7] = var4.method1038((byte)-101);
                           ++var7;
                        }

                        while(true) {
                           while(this.field8686 > var7) {
                              this.field8685[var7] = var4.method1038((byte)-101);
                              ++var7;
                           }

                           int var8 = 0;
                           if (var3 == 0) {
                              if (var3 != 0) {
                                 this.field8682[var8] = new int[var4.method1104(255)];
                                 ++var8;
                              }

                              while(true) {
                                 while(~var8 > ~this.field8686) {
                                    this.field8682[var8] = new int[var4.method1104(255)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (var3 == 0) {
                                    if (var3 == 0 && var9 >= this.field8686) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3 != 0) {
                                          this.field8682[var9][var10] = var4.method1104(255);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field8682[var9].length > var10) {
                                             this.field8682[var9][var10] = var4.method1104(255);
                                             ++var10;
                                          }

                                          if (var3 == 0) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(var9 < this.field8686);

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
               this.field8687[var5] = var4.method1104(255);
            }

            if (this.field8687[var5] == 6) {
               this.field8687[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field8688[1] + arg0 + ',' + (arg1 != null ? field8688[0] : field8688[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
