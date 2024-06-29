import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class760 {
   @OriginalMember(
      owner = "client!wba",
      name = "o",
      descriptor = "I"
   )
   public int field11237;
   @OriginalMember(
      owner = "client!wba",
      name = "k",
      descriptor = "B"
   )
   public byte field11241;
   @OriginalMember(
      owner = "client!wba",
      name = "n",
      descriptor = "I"
   )
   public int field11234;
   @OriginalMember(
      owner = "client!wba",
      name = "d",
      descriptor = "I"
   )
   public int field11232;
   @OriginalMember(
      owner = "client!wba",
      name = "m",
      descriptor = "Lbaa;"
   )
   public class109 field11240;
   @OriginalMember(
      owner = "client!wba",
      name = "l",
      descriptor = "I"
   )
   public int field11229;
   @OriginalMember(
      owner = "client!wba",
      name = "g",
      descriptor = "I"
   )
   public int field11231;
   @OriginalMember(
      owner = "client!wba",
      name = "c",
      descriptor = "I"
   )
   public int field11245;
   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11246 = new String[]{method5571(method5570("\u0018\u000b\u0016\u0018RG")), method5571(method5570("\u0018\u000b\u0016\u0018QG")), method5571(method5570("\u0018\u000b\u0016\u0018/\u0006\u0007\u001eB-G")), method5571(method5570("\u0001\u001c\u001bZ")), method5571(method5570("\u0014GY\u0018n"))};
   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field11230 = new class113(43, -1);
   @OriginalMember(
      owner = "client!wba",
      name = "e",
      descriptor = "I"
   )
   public static int field11233;
   @OriginalMember(
      owner = "client!wba",
      name = "j",
      descriptor = "I"
   )
   public static int field11235;
   @OriginalMember(
      owner = "client!wba",
      name = "f",
      descriptor = "I"
   )
   public static int field11242;
   @OriginalMember(
      owner = "client!wba",
      name = "q",
      descriptor = "I"
   )
   public static int field11244;
   @OriginalMember(
      owner = "client!wba",
      name = "i",
      descriptor = "Lvb;"
   )
   public class138 field11238;
   @OriginalMember(
      owner = "client!wba",
      name = "h",
      descriptor = "Lec;"
   )
   public class184 field11243;
   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "Lmd;"
   )
   public class54 field11236;
   @OriginalMember(
      owner = "client!wba",
      name = "p",
      descriptor = "Lon;"
   )
   public class617 field11239;

   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "(B)V",
      line = 6
   )
   public static void method5568(byte arg0) {
      try {
         field11230 = null;
         int var1 = 105 / ((arg0 - 20) / 45);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11246[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(B)Z",
      line = 23
   )
   public final boolean method5569(byte arg0) {
      try {
         ++field11244;
         if (arg0 >= -87) {
            field11233 = -52;
         }

         return this.field11241 == 2 || this.field11241 == 3;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11246[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "<init>",
      descriptor = "(BIIIIIILbaa;)V",
      line = 45
   )
   public class760(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class109 arg7) {
      try {
         this.field11237 = arg2;
         this.field11241 = arg0;
         this.field11234 = arg6;
         this.field11232 = arg3;
         this.field11240 = arg7;
         this.field11229 = arg1;
         this.field11231 = arg4;
         this.field11245 = arg5;
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field11246[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field11246[4] : field11246[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5570(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5571(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
