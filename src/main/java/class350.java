import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class350 {
   @OriginalMember(
      owner = "client!wh",
      name = "g",
      descriptor = "I"
   )
   public int field5129 = -1;
   @OriginalMember(
      owner = "client!wh",
      name = "f",
      descriptor = "I"
   )
   public int field5130 = -1;
   @OriginalMember(
      owner = "client!wh",
      name = "e",
      descriptor = "[I"
   )
   public int[] field5126;
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5137 = new String[]{method2766(method2765("goy8R~n#:\u0013")), method2766(method2765("goyF\u0013")), method2766(method2765("~r;h")), method2766(method2765("k)y*F")), method2766(method2765("goyE\u0013"))};
   @OriginalMember(
      owner = "client!wh",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field5131 = false;
   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "Lfm;"
   )
   public static class164 field5132 = new class164(67, 4);
   @OriginalMember(
      owner = "client!wh",
      name = "k",
      descriptor = "Lfm;"
   )
   public static class164 field5135 = new class164(27, 8);
   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field5136 = new class724(130, 10);
   @OriginalMember(
      owner = "client!wh",
      name = "j",
      descriptor = "I"
   )
   public static int field5128;
   @OriginalMember(
      owner = "client!wh",
      name = "h",
      descriptor = "Leda;"
   )
   public static class551 field5134;
   @OriginalMember(
      owner = "client!wh",
      name = "i",
      descriptor = "[I"
   )
   public int[] field5127;
   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "[I"
   )
   public int[] field5133;

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2763(int arg0) {
      try {
         field5134 = null;
         field5136 = null;
         if (arg0 != -30970) {
            field5132 = null;
         }

         field5135 = null;
         field5132 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5137[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   private final void method2764(int arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         label137:
         while(true) {
            label117:
            while(true) {
               int var4 = arg1.method665(false);
               if (var4 == 0) {
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     break label137;
                  }
               }

               if (~var4 != -2) {
                  if (var4 == 3) {
                     this.field5130 = arg1.method665(false);
                     if (!var3) {
                        continue;
                     }
                  }

                  if (~var4 != -5) {
                     if (var4 == 5) {
                        this.field5133 = new int[arg1.method665(false)];
                        int var5 = 0;
                        if (var3) {
                           this.field5133[var5] = arg1.method665(false);
                           ++var5;
                        }

                        while(true) {
                           while(var5 < this.field5133.length) {
                              this.field5133[var5] = arg1.method665(false);
                              ++var5;
                           }

                           if (!var3) {
                              if (!var3) {
                                 continue label117;
                              }
                              break;
                           }

                           ++var5;
                        }
                     }

                     if (var4 != 6) {
                        continue;
                     }

                     this.field5127 = new int[arg1.method665(false)];
                     int var6 = 0;
                     if (var3) {
                        this.field5127[var6] = arg1.method665(false);
                        ++var6;
                     }

                     while(true) {
                        while(var6 < this.field5127.length) {
                           this.field5127[var6] = arg1.method665(false);
                           ++var6;
                        }

                        if (!var3) {
                           if (!var3) {
                              continue label117;
                           }
                           break;
                        }

                        ++var6;
                     }
                  }

                  this.field5129 = arg1.method665(false);
                  if (!var3) {
                     continue;
                  }
               }
               break;
            }

            int var7 = arg1.method665(false);
            this.field5126 = new int[var7];
            int var8 = 0;
            if (var3) {
               this.field5126[var8] = arg1.method665(false);
               ++var8;
            }

            while(true) {
               while(var8 < this.field5126.length) {
                  this.field5126[var8] = arg1.method665(false);
                  ++var8;
               }

               if (!var3) {
                  if (var3) {
                     break label137;
                  }
                  break;
               }

               ++var8;
            }
         }

         ++field5128;
         int var9 = 94 / ((arg0 - -54) / 37);
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5137[4] + arg0 + ',' + (arg1 != null ? field5137[3] : field5137[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "(Lsa;)V"
   )
   public class350(class39 arg0) {
      try {
         byte[] var2 = arg0.method449(6, (byte)-62);
         this.method2764(10, new class65(var2));
         if (this.field5126 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5137[0] + (arg0 != null ? field5137[3] : field5137[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "()V"
   )
   protected class350() {
      try {
         this.field5126 = new int[0];
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5137[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2765(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2766(char[] arg0) {
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
            var10005 = 7;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
