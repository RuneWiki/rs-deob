import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class163 {
   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2319 = new String[]{method1362(method1361("(x;-\u0002")), method1362(method1361("(x;,\u0002")), method1362(method1361("(x;(\u0002")), method1362(method1361("(x;+\u0002")), method1362(method1361("(x;*\u0002"))};
   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "I"
   )
   public int field2309;
   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "I"
   )
   public static int field2310;
   @OriginalMember(
      owner = "client!vf",
      name = "f",
      descriptor = "I"
   )
   public int field2311;
   @OriginalMember(
      owner = "client!vf",
      name = "e",
      descriptor = "I"
   )
   public static int field2312;
   @OriginalMember(
      owner = "client!vf",
      name = "j",
      descriptor = "I"
   )
   public static int field2313;
   @OriginalMember(
      owner = "client!vf",
      name = "d",
      descriptor = "I"
   )
   public int field2314;
   @OriginalMember(
      owner = "client!vf",
      name = "i",
      descriptor = "I"
   )
   public static int field2315;
   @OriginalMember(
      owner = "client!vf",
      name = "h",
      descriptor = "I"
   )
   public static int field2316;
   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "I"
   )
   public static int field2317;
   @OriginalMember(
      owner = "client!vf",
      name = "g",
      descriptor = "I"
   )
   public static int field2318;

   @OriginalMember(
      owner = "client!vf",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method1356(int arg0) {
      try {
         ++field2317;
         if (arg0 < 26) {
            return false;
         } else {
            return (8 & this.field2314) != 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2319[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method1357(int arg0) {
      try {
         if (arg0 != -22203) {
            this.field2309 = 119;
         }

         ++field2315;
         return ~(this.field2314 & 2) != -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2319[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method1358(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field2313;
            return (this.field2314 & 1) != 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2319[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1359(int arg0) {
      try {
         if (arg0 != 22590) {
            method1359(119);
         }

         ++field2310;
         class598.field8796 = class61.method468(35, 0.4F, 2048, 0, true, 8, 8, 4);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2319[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method1360(int arg0) {
      try {
         ++field2316;
         if (arg0 != 0) {
            field2312 = 74;
         }

         return ~(this.field2314 & 4) != -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2319[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1361(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1362(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
