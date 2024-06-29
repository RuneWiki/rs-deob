import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class592 {
   @OriginalMember(
      owner = "client!k",
      name = "f",
      descriptor = "[I"
   )
   private int[] field8712;
   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8719 = new String[]{method4307(method4306("\u0005#rG")), method4307(method4306("\u0010x0\u0005<")), method4307(method4306("\u0000x\"B/\u0002\" \u0003")), method4307(method4306("\u0000x]\u0003")), method4307(method4306("\u0000x_\u0003")), method4307(method4306("\u0000x\\\u0003")), method4307(method4306("\u0000xZ\u0003"))};
   @OriginalMember(
      owner = "client!k",
      name = "b",
      descriptor = "Lqca;"
   )
   public static class127 field8711 = new class127(8, 1);
   @OriginalMember(
      owner = "client!k",
      name = "d",
      descriptor = "I"
   )
   public static int field8714;
   @OriginalMember(
      owner = "client!k",
      name = "g",
      descriptor = "I"
   )
   public static int field8715;
   @OriginalMember(
      owner = "client!k",
      name = "e",
      descriptor = "I"
   )
   public static int field8717;
   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "I"
   )
   public static int field8718;
   @OriginalMember(
      owner = "client!k",
      name = "c",
      descriptor = "Lkt;"
   )
   public static class169 field8713;
   @OriginalMember(
      owner = "client!k",
      name = "h",
      descriptor = "Lne;"
   )
   public static class338 field8716;

   @OriginalMember(
      owner = "client!k",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class592(int[] arg0) {
      boolean var2 = client.field4360;
      super();

      try {
         int var3 = 1;
         if (var2) {
            var3 <<= 1;
         }

         while(true) {
            while(~var3 >= ~((arg0.length >> 1) + arg0.length)) {
               var3 <<= 1;
            }

            this.field8712 = new int[var3 + var3];
            if (!var2) {
               int var4 = 0;
               if (var2) {
                  this.field8712[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(var4 < var3 - -var3) {
                     this.field8712[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (!var2) {
                     if (!var2 && ~var5 <= ~arg0.length) {
                        return;
                     }

                     do {
                        int var6 = var3 + -1 & arg0[var5];
                        if (var2) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        while(this.field8712[var6 + 1 + var6] != -1) {
                           var6 = var3 + -1 & var6 + 1;
                        }

                        this.field8712[var6 + var6] = arg0[var5];
                        this.field8712[var6 + 1 + var6] = var5++;
                     } while(~var5 > ~arg0.length);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8719[2] + (arg0 != null ? field8719[1] : field8719[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4302(int arg0) {
      try {
         ++field8715;
         class101.field1300 = 0;
         int var1 = -77 % ((27 - arg0) / 43);
         int var2 = (class564.field8045.field10694 >> 9) - -class672.field9740;
         int var3 = (class564.field8045.field10693 >> 9) - -class533.field7595;
         if (var2 >= 3053 && ~var2 >= -3157 && ~var3 <= -3057 && var3 <= 3136) {
            class101.field1300 = 1;
         }

         if (var2 >= 3072 && var2 <= 3118 && ~var3 <= -9493 && ~var3 >= -9536) {
            class101.field1300 = 1;
         }

         if (class101.field1300 == 1 && ~var2 <= -3140 && var2 <= 3199 && ~var3 <= -3009 && ~var3 >= -3063) {
            class101.field1300 = 0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8719[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4303(boolean arg0) {
      try {
         field8716 = null;
         field8713 = null;
         if (arg0) {
            method4302(-66);
         }

         field8711 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8719[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method4304(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8714;
         if (arg0 != 25212) {
            field8711 = null;
         }

         int var4 = (this.field8712.length >> 1) + -1;
         int var5 = arg1 & var4;

         while(true) {
            int var6 = this.field8712[var5 - -var5 + 1];
            int var10000;
            if (var6 == -1) {
               var10000 = -1;
               if (!var3) {
                  return -1;
               }
            } else {
               var10000 = arg1;
            }

            if (var10000 == this.field8712[var5 + var5]) {
               return var6;
            }

            var5 = var5 + 1 & var4;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8719[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4305(byte arg0) {
      try {
         if (arg0 <= 56) {
            return 17;
         } else {
            ++field8718;
            return class614.field9025 == 1 ? class532.field7589 : 0;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8719[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!k",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
