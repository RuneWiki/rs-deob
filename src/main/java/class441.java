import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class441 extends class70 {
   @OriginalMember(
      owner = "client!mba",
      name = "A",
      descriptor = "I"
   )
   private int field6722;
   @OriginalMember(
      owner = "client!mba",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6730 = new String[]{method3342(method3341("X:$\u0000$\u001d")), method3342(method3341("X:$\u0000U\\6,ZW\u001d")), method3342(method3341("X:$\u0000#\u001d")), method3342(method3341("X:$\u0000'\u001d")), method3342(method3341("X:$\u0000 \u001d")), method3342(method3341("X:$\u00009\u001d")), method3342(method3341("X:$\u0000\"\u001d")), method3342(method3341("X:$\u0000&\u001d")), method3342(method3341("X:$\u0000%\u001d"))};
   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "Laq;"
   )
   public static class170 field6719 = new class170(8);
   @OriginalMember(
      owner = "client!mba",
      name = "E",
      descriptor = "I"
   )
   public static int field6721;
   @OriginalMember(
      owner = "client!mba",
      name = "B",
      descriptor = "I"
   )
   public static int field6723;
   @OriginalMember(
      owner = "client!mba",
      name = "H",
      descriptor = "I"
   )
   public static int field6725;
   @OriginalMember(
      owner = "client!mba",
      name = "G",
      descriptor = "I"
   )
   public static int field6726;
   @OriginalMember(
      owner = "client!mba",
      name = "F",
      descriptor = "I"
   )
   public static int field6727;
   @OriginalMember(
      owner = "client!mba",
      name = "y",
      descriptor = "I"
   )
   public static int field6728;
   @OriginalMember(
      owner = "client!mba",
      name = "D",
      descriptor = "I"
   )
   public static int field6729;
   @OriginalMember(
      owner = "client!mba",
      name = "C",
      descriptor = "[Lri;"
   )
   public class121[] field6724;
   @OriginalMember(
      owner = "client!mba",
      name = "x",
      descriptor = "[[B"
   )
   private byte[][] field6720;

   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "(B)Z",
      line = 5
   )
   public final boolean method3333(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "(II)Z",
      line = 116
   )
   public final boolean method3334(int arg0, int arg1) {
      try {
         ++field6728;
         return arg1 != 1359 ? true : this.field6724[arg0].field1468;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6730[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(IB)V",
      line = 127
   )
   public static final void method3335(int arg0, byte arg1) {
      try {
         ++field6725;
         class403 var2 = class453.method3410((long)arg0, true, 17);
         var2.method3096((byte)83);
         if (arg1 != -92) {
            field6719 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6730[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "c",
      descriptor = "(III)Z",
      line = 141
   )
   public static final boolean method3336(int arg0, int arg1, int arg2) {
      try {
         ++field6723;
         if (arg1 >= arg0 && arg2 < 1000) {
            return true;
         } else if (arg1 < 1000 && arg2 < 1000) {
            if (class714.method5173((byte)78, arg2)) {
               return true;
            } else {
               return !class714.method5173((byte)86, arg1);
            }
         } else {
            return ~arg1 <= -1001 && ~arg2 <= -1001;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6730[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "(IB)V",
      line = 169
   )
   public static final void method3337(int arg0, byte arg1) {
      try {
         ++field6727;
         if (arg1 != -2) {
            method3335(93, (byte)-54);
         }

         class403 var2 = class453.method3410((long)arg0, true, 7);
         var2.method3096((byte)78);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6730[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "d",
      descriptor = "(II)Z",
      line = 182
   )
   public final boolean method3338(int arg0, int arg1) {
      try {
         ++field6721;
         int var3 = 4 / ((60 - arg0) / 46);
         return this.field6724[arg1].field1476;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6730[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "c",
      descriptor = "(II)Z",
      line = 193
   )
   public final boolean method3339(int arg0, int arg1) {
      try {
         int var3 = 23 % ((arg0 - 75) / 46);
         ++field6729;
         return this.field6724[arg1].field1475;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6730[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(B)V",
      line = 206
   )
   public static void method3340(byte arg0) {
      try {
         int var1 = -76 % ((arg0 - -28) / 49);
         field6719 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6730[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "(I)V",
      line = 214
   )
   public class441(int arg0) {
      try {
         this.field6722 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6730[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3342(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
