import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class764 {
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11304 = new String[]{method5597(method5596("\u0015|i<")), method5597(method5596("\rf+\u0012\r")), method5597(method5596("\u0000'+~X")), method5597(method5596("\rf+\u0011\r")), method5597(method5596("\rf+\u0013\r"))};
   @OriginalMember(
      owner = "client!vo",
      name = "g",
      descriptor = "C"
   )
   public char field11299;
   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "I"
   )
   public static int field11297;
   @OriginalMember(
      owner = "client!vo",
      name = "f",
      descriptor = "I"
   )
   public int field11298;
   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "I"
   )
   public static int field11300;
   @OriginalMember(
      owner = "client!vo",
      name = "d",
      descriptor = "I"
   )
   public static int field11301;
   @OriginalMember(
      owner = "client!vo",
      name = "e",
      descriptor = "I"
   )
   public int field11302;
   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "I"
   )
   public int field11303;

   static {
      new BitSet(65536);
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IZLica;)V",
      line = 9
   )
   private final void method5593(int arg0, boolean arg1, class354 arg2) {
      try {
         label30: {
            if (arg0 == 1) {
               this.field11299 = class424.method3361((byte)80, arg2.method2886((byte)88));
               if (!client.field1786) {
                  break label30;
               }
            }

            if (arg0 == 2) {
               this.field11302 = arg2.method2848(-112);
               this.field11303 = arg2.method2855(-31007);
               this.field11298 = arg2.method2855(-31007);
            }
         }

         ++field11301;
         if (!arg1) {
            this.field11302 = 73;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11304[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11304[2] : field11304[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(IC)Z",
      line = 34
   )
   public static final boolean method5594(int arg0, char arg1) {
      try {
         ++field11300;
         int var2 = -3 / ((-65 - arg0) / 53);
         return ~arg1 == -161 || arg1 == ' ' || arg1 == '_' || arg1 == '-';
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11304[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(ILica;)V",
      line = 45
   )
   public final void method5595(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11297;
         if (arg0 == 32) {
            do {
               int var4 = arg1.method2855(-31007);
               if (~var4 == -1) {
                  break;
               }

               this.method5593(var4, true, arg1);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11304[3] + arg0 + ',' + (arg1 != null ? field11304[2] : field11304[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5596(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5597(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
