import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class269 extends class428 {
   @OriginalMember(
      owner = "client!se",
      name = "n",
      descriptor = "I"
   )
   public int field3716;
   @OriginalMember(
      owner = "client!se",
      name = "r",
      descriptor = "I"
   )
   public int field3719;
   @OriginalMember(
      owner = "client!se",
      name = "m",
      descriptor = "[I"
   )
   public int[] field3722;
   @OriginalMember(
      owner = "client!se",
      name = "q",
      descriptor = "[Z"
   )
   public boolean[] field3720;
   @OriginalMember(
      owner = "client!se",
      name = "o",
      descriptor = "[[I"
   )
   public int[][] field3718;
   @OriginalMember(
      owner = "client!se",
      name = "s",
      descriptor = "[I"
   )
   public int[] field3717;
   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3723 = new String[]{method2073(method2072("}cIL")), method2073(method2072("h8\u000b\u000ek")), method2073(method2072("`s\u000b\u001c\u007f}\u007fQ\u001e>")), method2073(method2072("`s\u000ba>"))};
   @OriginalMember(
      owner = "client!se",
      name = "p",
      descriptor = "Lew;"
   )
   public static class521 field3721;

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(Z)V",
      line = 9
   )
   public static void method2071(boolean arg0) {
      try {
         field3721 = null;
         if (arg0) {
            field3721 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3723[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "<init>",
      descriptor = "(I[B)V",
      line = 20
   )
   public class269(int arg0, byte[] arg1) {
      boolean var3 = client.field4360;
      super();

      try {
         this.field3716 = arg0;
         class147 var4 = new class147(arg1);
         this.field3719 = var4.method1143(-15465);
         this.field3722 = new int[this.field3719];
         this.field3720 = new boolean[this.field3719];
         this.field3718 = new int[this.field3719][];
         this.field3717 = new int[this.field3719];
         int var5 = 0;
         if (var3) {
            this.field3717[var5] = var4.method1143(-15465);
            if (~this.field3717[var5] == -7) {
               this.field3717[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (~this.field3719 >= ~var5) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field3720[var6] = var4.method1143(-15465) == 1;
                     ++var6;
                  }

                  while(true) {
                     while(~this.field3719 < ~var6) {
                        this.field3720[var6] = var4.method1143(-15465) == 1;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field3722[var7] = var4.method1211(-26166);
                           ++var7;
                        }

                        while(true) {
                           while(~var7 > ~this.field3719) {
                              this.field3722[var7] = var4.method1211(-26166);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field3718[var8] = new int[var4.method1143(-15465)];
                                 ++var8;
                              }

                              while(true) {
                                 while(~this.field3719 < ~var8) {
                                    this.field3718[var8] = new int[var4.method1143(-15465)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && ~this.field3719 >= ~var9) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field3718[var9][var10] = var4.method1143(-15465);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field3718[var9].length > var10) {
                                             this.field3718[var9][var10] = var4.method1143(-15465);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(~this.field3719 < ~var9);

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
               this.field3717[var5] = var4.method1143(-15465);
            }

            if (~this.field3717[var5] == -7) {
               this.field3717[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field3723[2] + arg0 + ',' + (arg1 != null ? field3723[1] : field3723[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
