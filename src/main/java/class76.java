import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class76 {
   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field983 = new String[]{method722(method721("S1Yn\t")), method722(method721("Fj\u001b,")), method722(method721("GjY\u0002\\")), method722(method721("GjY\u0003\\")), method722(method721("GjY\u0001\\"))};
   @OriginalMember(
      owner = "client!ou",
      name = "h",
      descriptor = "I"
   )
   public static int field980 = -1;
   @OriginalMember(
      owner = "client!ou",
      name = "d",
      descriptor = "C"
   )
   public char field977;
   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "I"
   )
   public static int field974;
   @OriginalMember(
      owner = "client!ou",
      name = "g",
      descriptor = "I"
   )
   public int field976;
   @OriginalMember(
      owner = "client!ou",
      name = "f",
      descriptor = "I"
   )
   public int field978;
   @OriginalMember(
      owner = "client!ou",
      name = "c",
      descriptor = "I"
   )
   public int field979;
   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "I"
   )
   public static int field981;
   @OriginalMember(
      owner = "client!ou",
      name = "i",
      descriptor = "I"
   )
   public static int field982;
   @OriginalMember(
      owner = "client!ou",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field975;

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method718(int arg0) {
      try {
         if (arg0 == 7566) {
            field975 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field983[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(ILica;B)V"
   )
   private final void method719(int arg0, class354 arg1, byte arg2) {
      try {
         if (arg2 < 102) {
            this.field978 = -119;
         }

         label30: {
            if (~arg0 != -2) {
               if (arg0 != 3) {
                  break label30;
               }

               this.field979 = arg1.method2848(-107);
               this.field976 = arg1.method2855(-31007);
               this.field978 = arg1.method2855(-31007);
               if (!client.field1786) {
                  break label30;
               }
            }

            this.field977 = class424.method3361((byte)76, arg1.method2886((byte)88));
         }

         ++field981;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field983[2] + arg0 + ',' + (arg1 != null ? field983[0] : field983[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Lica;B)V"
   )
   public final void method720(class354 arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg0.method2855(arg1 ^ 31021);
            if (~var4 != -1) {
               this.method719(var4, arg0, (byte)109);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field974;
            break;
         }

         if (arg1 != -52) {
            this.method720((class354)null, (byte)100);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field983[3] + (arg0 != null ? field983[0] : field983[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
