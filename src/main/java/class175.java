import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class175 {
   @OriginalMember(
      owner = "client!tga",
      name = "g",
      descriptor = "I"
   )
   public int field2599 = 0;
   @OriginalMember(
      owner = "client!tga",
      name = "h",
      descriptor = "I"
   )
   public int field2605 = 2048;
   @OriginalMember(
      owner = "client!tga",
      name = "i",
      descriptor = "I"
   )
   public int field2601 = 0;
   @OriginalMember(
      owner = "client!tga",
      name = "e",
      descriptor = "I"
   )
   public int field2602 = 2048;
   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2608 = new String[]{method1613(method1612("5Io\u001b~i")), method1613(method1612(":\u0000 \u001bA")), method1613(method1612("/[bY")), method1613(method1612("5Io\u001b\u007fi")), method1613(method1612("5Io\u001b}i"))};
   @OriginalMember(
      owner = "client!tga",
      name = "c",
      descriptor = "I"
   )
   public static int field2600;
   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "I"
   )
   public static int field2606;
   @OriginalMember(
      owner = "client!tga",
      name = "d",
      descriptor = "I"
   )
   public static int field2607;
   @OriginalMember(
      owner = "client!tga",
      name = "f",
      descriptor = "[Lma;"
   )
   public static class148[] field2604;
   @OriginalMember(
      owner = "client!tga",
      name = "b",
      descriptor = "[[S"
   )
   public static short[][] field2603;

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1609(boolean arg0) {
      try {
         if (!arg0) {
            field2600 = 109;
         }

         field2603 = null;
         field2604 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2608[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method1610(class65 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field2606;

         while(true) {
            int var4 = arg0.method665(false);
            if (var4 != 0) {
               this.method1611(94, var4, arg0);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg1 >= -16) {
               this.field2599 = 70;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2608[0] + (arg0 != null ? field2608[1] : field2608[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "a",
      descriptor = "(IILcu;)V"
   )
   private final void method1611(int arg0, int arg1, class65 arg2) {
      boolean var4 = client.field10022;

      try {
         label42: {
            int var5 = 54 / ((arg0 - -52) / 34);
            if (~arg1 != -2) {
               if (arg1 == 2) {
                  this.field2602 = arg2.method685(-2);
                  if (!var4) {
                     break label42;
                  }
               }

               if (arg1 != 3) {
                  if (arg1 != 4) {
                     break label42;
                  }

                  this.field2601 = arg2.method655((byte)89);
                  if (!var4) {
                     break label42;
                  }
               }

               this.field2605 = arg2.method685(-2);
               if (!var4) {
                  break label42;
               }
            }

            this.field2599 = arg2.method665(false);
         }

         ++field2607;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2608[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2608[1] : field2608[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
