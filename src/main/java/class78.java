import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class78 extends class561 {
   @OriginalMember(
      owner = "client!naa",
      name = "o",
      descriptor = "I"
   )
   public int field976 = -1;
   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field977 = new String[]{method761(method760("p\u0006@?z6")), method761(method760("p\u0006@?{6")), method761(method760("p\u0006@?x6"))};
   @OriginalMember(
      owner = "client!naa",
      name = "l",
      descriptor = "I"
   )
   public static int field974 = 0;
   @OriginalMember(
      owner = "client!naa",
      name = "k",
      descriptor = "I"
   )
   public static int field973 = 0;
   @OriginalMember(
      owner = "client!naa",
      name = "r",
      descriptor = "I"
   )
   public static int field969;
   @OriginalMember(
      owner = "client!naa",
      name = "p",
      descriptor = "I"
   )
   public static int field970;
   @OriginalMember(
      owner = "client!naa",
      name = "n",
      descriptor = "I"
   )
   public int field971;
   @OriginalMember(
      owner = "client!naa",
      name = "q",
      descriptor = "I"
   )
   public static int field972;
   @OriginalMember(
      owner = "client!naa",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field968;
   @OriginalMember(
      owner = "client!naa",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public String field975;

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method757(boolean arg0, int arg1) {
      try {
         ++field970;
         if (arg1 <= 28) {
            method758(false, 104, -67, -67);
         }

         int var2 = class493.field6783;
         int var3 = class247.field3108;
         if (arg0 && class33.field392) {
            var2 <<= 1;
            var3 = -var2;
         }

         class338.field4832.method511(var3, var2);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field977[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public static final void method758(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = class674.field9907.field8422.method5190((byte)-112) * arg3 >> 8;
         ++field969;
         if (~var7 != -1 && ~arg2 != 0) {
            if (!class694.field10136 && class215.field2664 != -1 && class595.method4345(false) && !class228.method1733(2)) {
               class33.field391 = class290.method2186(127);
               class69 var4 = class114.method991(class33.field391, (byte)-71);
               class175.method1358(48, true, var4);
            }

            class307.method2305(0, false, (byte)122, class711.field10432, var7, arg2);
            class624.method4535(255, -1, !arg0);
            class694.field10136 = true;
         }

         if (!arg0) {
            method758(false, -79, 65, 101);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field977[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "a",
      descriptor = "(B)Loga;"
   )
   public final class503 method759(byte arg0) {
      try {
         if (arg0 <= 60) {
            return null;
         } else {
            ++field972;
            return class233.field2891[super.field7686];
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field977[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method760(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!naa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method761(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
