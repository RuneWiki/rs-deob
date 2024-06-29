import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class665 {
   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9468 = new String[]{method4817(method4816("itOh8")), method4817(method4816("tq\rE")), method4817(method4816("a*O\u0007m")), method4817(method4816("itOk8"))};
   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "I"
   )
   public static int field9465;
   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "I"
   )
   public static int field9466;
   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "I"
   )
   public static int field9467;

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(IILha;Lod;I)V"
   )
   public static final void method4814(int arg0, int arg1, class65 arg2, class536 arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         ++field9467;
         class572.field7867.method3861(arg0 + -269287056);
         if (!class412.field5795) {
            if (arg0 == 269287172) {
               class168 var6 = (class168)arg3.method3855(115);
               if (var5 || var6 != null) {
                  do {
                     class297 var7 = class618.field8609.method5236(var6.field2123, (byte)70);
                     if (class543.method3920((byte)122, var7)) {
                        boolean var8 = class573.method4130(var7, 1, arg1, arg4, var6, arg2);
                        if (var8) {
                           class243.method1820(var6, arg2, (byte)46, var7);
                        }
                     }

                     var6 = (class168)arg3.method3866((byte)111);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field9468[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9468[2] : field9468[1]) + ',' + (arg3 != null ? field9468[2] : field9468[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4815(byte arg0) {
      boolean var1 = client.field4273;

      try {
         label35: {
            ++field9465;
            if (!class390.method2967(true, class445.field6162) && !class265.method2032(20, class445.field6162)) {
               int var2 = class278.field3709.field7853[0] >> 3;
               int var3 = class278.field3709.field7855[0] >> 3;
               if (var2 >= 0 && ~(class507.field7030 >> 3) < ~var2 && var3 >= 0 && var3 < class215.field2667 >> 3) {
                  class60.method450(5000, (byte)-106, var3, var2);
                  if (!var1) {
                     break label35;
                  }
               }

               class60.method450(0, (byte)-83, class215.field2667 >> 4, class507.field7030 >> 4);
               if (!var1) {
                  break label35;
               }
            }

            class60.method450(5000, (byte)-95, class532.field7284 >> 12, class737.field10747 >> 12);
         }

         class458.method3371(26);
         class323.method2433((byte)106);
         class795.method5726((byte)90);
         int var4 = -115 % ((arg0 - 52) / 63);
         class138.method1161(0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9468[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4816(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4817(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
