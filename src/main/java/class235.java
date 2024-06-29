import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class235 extends class673 {
   @OriginalMember(
      owner = "client!er",
      name = "l",
      descriptor = "I"
   )
   public int field2952;
   @OriginalMember(
      owner = "client!er",
      name = "r",
      descriptor = "I"
   )
   public int field2957;
   @OriginalMember(
      owner = "client!er",
      name = "p",
      descriptor = "[[I"
   )
   public int[][] field2956;
   @OriginalMember(
      owner = "client!er",
      name = "o",
      descriptor = "[I"
   )
   public int[] field2953;
   @OriginalMember(
      owner = "client!er",
      name = "n",
      descriptor = "[Z"
   )
   public boolean[] field2958;
   @OriginalMember(
      owner = "client!er",
      name = "q",
      descriptor = "[I"
   )
   public int[] field2951;
   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2959 = new String[]{method1871(method1870("\"fJ\u0013")), method1871(method1870("7=\bQ\n")), method1871(method1870(")a\bC\u001e\"zRA_"))};
   @OriginalMember(
      owner = "client!er",
      name = "s",
      descriptor = "I"
   )
   public static int field2954 = -1;
   @OriginalMember(
      owner = "client!er",
      name = "m",
      descriptor = "I"
   )
   public static int field2955 = 0;

   @OriginalMember(
      owner = "client!er",
      name = "<init>",
      descriptor = "(I[B)V"
   )
   public class235(int arg0, byte[] arg1) {
      boolean var3 = client.field1481;
      super();

      try {
         this.field2952 = arg0;
         class66 var4 = new class66(arg1);
         this.field2957 = var4.method640(255);
         this.field2956 = new int[this.field2957][];
         this.field2953 = new int[this.field2957];
         this.field2958 = new boolean[this.field2957];
         this.field2951 = new int[this.field2957];
         int var5 = 0;
         if (var3) {
            this.field2953[var5] = var4.method640(255);
            if (this.field2953[var5] == 6) {
               this.field2953[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (~var5 <= ~this.field2957) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field2958[var6] = var4.method640(255) == 1;
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > ~this.field2957) {
                        this.field2958[var6] = var4.method640(255) == 1;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field2951[var7] = var4.method603(-2);
                           ++var7;
                        }

                        while(true) {
                           while(this.field2957 > var7) {
                              this.field2951[var7] = var4.method603(-2);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field2956[var8] = new int[var4.method640(255)];
                                 ++var8;
                              }

                              while(true) {
                                 while(~this.field2957 < ~var8) {
                                    this.field2956[var8] = new int[var4.method640(255)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && this.field2957 <= var9) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field2956[var9][var10] = var4.method640(255);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field2956[var9].length > var10) {
                                             this.field2956[var9][var10] = var4.method640(255);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(this.field2957 > var9);

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
               this.field2953[var5] = var4.method640(255);
            }

            if (this.field2953[var5] == 6) {
               this.field2953[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field2959[2] + arg0 + ',' + (arg1 != null ? field2959[1] : field2959[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1870(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!er",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1871(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
