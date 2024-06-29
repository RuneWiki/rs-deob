import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class727 {
   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10860 = new String[]{method5368(method5367("\u0019${\u0005")), method5368(method5367("\f\u007f9G\u0015")), method5368(method5367("\u000499(@")), method5368(method5367("\u000499*@")), method5368(method5367("\u000499,@")), method5368(method5367("\u000499+@")), method5368(method5367("\u000499-@"))};
   @OriginalMember(
      owner = "client!sh",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field10856 = new int[]{7, 8, 9, 10, 11, 12, 13, 15};
   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "I"
   )
   public static int field10854 = -1;
   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "Lsl;"
   )
   public static class242 field10855 = new class242(2);
   @OriginalMember(
      owner = "client!sh",
      name = "c",
      descriptor = "I"
   )
   public static int field10852;
   @OriginalMember(
      owner = "client!sh",
      name = "g",
      descriptor = "I"
   )
   public static int field10853;
   @OriginalMember(
      owner = "client!sh",
      name = "d",
      descriptor = "I"
   )
   public static int field10857;
   @OriginalMember(
      owner = "client!sh",
      name = "e",
      descriptor = "I"
   )
   public static int field10858;
   @OriginalMember(
      owner = "client!sh",
      name = "h",
      descriptor = "I"
   )
   public static int field10859;

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5362(int arg0, int arg1) {
      try {
         ++field10853;
         class566 var2 = class146.method1321((long)arg1, arg0, -1428737160);
         var2.method4268(arg0 ^ 8);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10860[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(Lica;I)Ljava/lang/String;"
   )
   public static final String method5363(class354 arg0, int arg1) {
      try {
         ++field10859;
         return arg1 != 32767 ? null : class652.method4776((byte)-53, arg0, 32767);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10860[5] + (arg0 != null ? field10860[1] : field10860[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(BI[BIII)V"
   )
   public static final void method5364(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field10852;
         if (arg4 > arg1) {
            int var7 = 13 % ((arg0 - -28) / 37);
            arg5 = -arg1 + arg4 >> 2;
            arg3 += arg1;
            int var10;
            if (var6) {
               var10 = arg3 + 1;
               arg2[arg3] = 1;
               int var11 = var10 + 1;
               arg2[var10] = 1;
               int var12 = var11 + 1;
               arg2[var11] = 1;
               arg3 = var12 + 1;
               arg2[var12] = 1;
            }

            while(true) {
               while(true) {
                  --arg5;
                  if (arg5 < 0) {
                     arg5 = 3 & -arg1 + arg4;
                     if (!var6) {
                        if (!var6) {
                           --arg5;
                           if (arg5 < 0) {
                              return;
                           }
                        }

                        do {
                           arg2[arg3++] = 1;
                           --arg5;
                        } while(arg5 >= 0);

                        return;
                     }

                     arg2[arg3++] = 1;
                  } else {
                     var10 = arg3 + 1;
                     arg2[arg3] = 1;
                     arg2[var10++] = 1;
                     arg2[var10++] = 1;
                     arg3 = var10 + 1;
                     arg2[var10] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10860[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10860[1] : field10860[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5365(int arg0) {
      try {
         if (arg0 != 26565) {
            method5362(85, 50);
         }

         field10855 = null;
         field10856 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10860[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5366(int arg0) {
      try {
         if (arg0 == 32566) {
            ++field10858;
            if (class519.field7897 != 0) {
               class37.field448.method204((byte)110);
               class186.method1672(true);
               class722.method5337(123);
            }
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10860[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5367(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5368(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
