import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class83 extends class428 {
   @OriginalMember(
      owner = "client!aw",
      name = "p",
      descriptor = "[B"
   )
   public byte[] field1081;
   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1084 = new String[]{method747(method746("\u0001\u0003^\nX")), method747(method746("\u0001\u0003^\u000bX")), method747(method746("\u0001\u0003^t\u0019\u000e\u001d\u0004vX")), method747(method746("\u000e\u0001\u001c$")), method747(method746("\u001bZ^f\r")), method747(method746("\u0001\u0003^\tX"))};
   @OriginalMember(
      owner = "client!aw",
      name = "r",
      descriptor = "I"
   )
   public static int field1080 = 0;
   @OriginalMember(
      owner = "client!aw",
      name = "q",
      descriptor = "I"
   )
   public static int field1078 = -1;
   @OriginalMember(
      owner = "client!aw",
      name = "o",
      descriptor = "I"
   )
   public static int field1077;
   @OriginalMember(
      owner = "client!aw",
      name = "m",
      descriptor = "I"
   )
   public static int field1079;
   @OriginalMember(
      owner = "client!aw",
      name = "s",
      descriptor = "I"
   )
   public static int field1082;
   @OriginalMember(
      owner = "client!aw",
      name = "n",
      descriptor = "I"
   )
   public static int field1083;

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method743(int arg0, byte arg1) {
      try {
         ++field1083;
         if (arg1 != 112) {
            field1078 = 17;
         }

         class755 var2 = class317.method2325((long)arg0, 97, 5);
         var2.method5481(-93);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1084[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method744(int arg0, int arg1, int arg2) {
      try {
         ++field1079;
         if (arg2 != -17694) {
            method745(42, 17, 57);
         }

         return (65536 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1084[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class83(byte[] arg0) {
      try {
         this.field1081 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1084[2] + (arg0 != null ? field1084[4] : field1084[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method745(int arg0, int arg1, int arg2) {
      try {
         ++field1077;
         if (arg0 != -14564) {
            return false;
         } else {
            return class753.method5461(true, arg2, arg1) | (458752 & arg1) != 0 || class652.method4779(arg1, arg2, (byte)-101);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1084[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method746(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method747(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
