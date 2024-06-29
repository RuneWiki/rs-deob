import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public class class398 {
   @OriginalMember(
      owner = "client!mka",
      name = "d",
      descriptor = "I"
   )
   public int field5479 = -1;
   @OriginalMember(
      owner = "client!mka",
      name = "i",
      descriptor = "I"
   )
   public int field5486 = -1;
   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5488 = new String[]{method3133(method3132("U9\u000f:")), method3133(method3132("V'\u0002x%\u0013")), method3133(method3132("@bMx\u001b")), method3133(method3132("V'\u0002x$\u0013")), method3133(method3132("V'\u0002x\"\u0013")), method3133(method3132("V'\u0002x'\u0013"))};
   @OriginalMember(
      owner = "client!mka",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field5484 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!mka",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field5485 = new int[500];
   @OriginalMember(
      owner = "client!mka",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5487 = null;
   @OriginalMember(
      owner = "client!mka",
      name = "c",
      descriptor = "I"
   )
   public static int field5477;
   @OriginalMember(
      owner = "client!mka",
      name = "f",
      descriptor = "I"
   )
   public static int field5480;
   @OriginalMember(
      owner = "client!mka",
      name = "e",
      descriptor = "I"
   )
   public static int field5481;
   @OriginalMember(
      owner = "client!mka",
      name = "b",
      descriptor = "I"
   )
   public static int field5483;
   @OriginalMember(
      owner = "client!mka",
      name = "k",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field5478;
   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "[I"
   )
   public int[] field5482;

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(ILgea;B)V"
   )
   private final void method3128(int arg0, class66 arg1, byte arg2) {
      boolean var4 = client.field1481;

      try {
         label65: {
            if (~arg0 != -2) {
               if (~arg0 == -3) {
                  this.field5482 = new int[arg1.method640(255)];
                  int var5 = 0;
                  if (var4) {
                     this.field5482[var5] = arg1.method603(-2);
                     ++var5;
                  }

                  while(true) {
                     while(this.field5482.length > var5) {
                        this.field5482[var5] = arg1.method603(-2);
                        ++var5;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label65;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               if (arg0 != 3) {
                  break label65;
               }

               this.field5479 = arg1.method640(255);
               if (!var4) {
                  break label65;
               }
            }

            this.field5486 = arg1.method603(-2);
         }

         ++field5480;
         if (arg2 != -46) {
            this.method3128(-14, (class66)null, (byte)3);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5488[1] + arg0 + ',' + (arg1 != null ? field5488[2] : field5488[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method3129(int arg0, String arg1) {
      try {
         ++field5477;
         if (arg0 != 12) {
            field5483 = 70;
         }

         return 1 + arg1.length();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5488[4] + arg0 + ',' + (arg1 != null ? field5488[2] : field5488[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(Lgea;I)V"
   )
   public final void method3130(class66 arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg0.method640(255);
            if (~var4 != -1) {
               this.method3128(var4, arg0, (byte)-46);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field5481;
            break;
         }

         if (arg1 != 3) {
            this.method3128(-37, (class66)null, (byte)60);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5488[3] + (arg0 != null ? field5488[2] : field5488[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3131(int arg0) {
      try {
         field5478 = null;
         field5487 = null;
         field5485 = null;
         field5484 = null;
         if (arg0 != 3) {
            method3131(29);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5488[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3132(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3133(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
