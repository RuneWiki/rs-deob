import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class123 extends class184 implements class99 {
   @OriginalMember(
      owner = "client!wq",
      name = "A",
      descriptor = "Lob;"
   )
   private class779 field1973;
   @OriginalMember(
      owner = "client!wq",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1980 = new String[]{method1218(method1217("\t\bXu?")), method1218(method1217("\t\bXv?")), method1218(method1217("\t\bXy?")), method1218(method1217("\t\bXq?")), method1218(method1217("\u0005WX\u001dj")), method1218(method1217("\u0010\f\u001a_")), method1218(method1217("\t\bX\u000f~\u0010\u0010\u0002\r?")), method1218(method1217("\t\bXt?")), method1218(method1217("\"VX\t;^&[\u0018L#\u00076")), method1218(method1217("\u000e\u0018\u0003@r")), method1218(method1217(".\u0018\u0003@~\u0010\u001eVUx\fY")), method1218(method1217("^\n\u0013Px\u0010\u001d\u0005\u001d9P")), method1218(method1217("\t\bXp?")), method1218(method1217("\t\bXr?")), method1218(method1217("\t\bXw?"))};
   @OriginalMember(
      owner = "client!wq",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field1974 = new int[2];
   @OriginalMember(
      owner = "client!wq",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field1976 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!wq",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field1977 = false;
   @OriginalMember(
      owner = "client!wq",
      name = "E",
      descriptor = "I"
   )
   public static int field1969;
   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "I"
   )
   public static int field1970;
   @OriginalMember(
      owner = "client!wq",
      name = "x",
      descriptor = "I"
   )
   public static int field1971;
   @OriginalMember(
      owner = "client!wq",
      name = "C",
      descriptor = "I"
   )
   public static int field1972;
   @OriginalMember(
      owner = "client!wq",
      name = "B",
      descriptor = "I"
   )
   public static int field1975;
   @OriginalMember(
      owner = "client!wq",
      name = "w",
      descriptor = "I"
   )
   public static int field1978;
   @OriginalMember(
      owner = "client!wq",
      name = "u",
      descriptor = "I"
   )
   public static int field1979;

   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "(I)Lob;"
   )
   public final class779 method980(int arg0) {
      try {
         ++field1970;
         if (arg0 != 17651) {
            this.method982(-24);
         }

         return this.field1973;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1980[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1215(int arg0) {
      try {
         field1976 = null;
         field1974 = null;
         if (arg0 != 85) {
            field1974 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1980[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method982(int arg0) {
      try {
         if (arg0 != -23434) {
            return false;
         } else {
            ++field1975;
            return super.method1660(super.field2702.field11148, 1);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1980[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method981(int arg0, byte arg1) {
      try {
         ++field1978;
         if (arg1 <= 114) {
            field1977 = false;
         }

         super.method981(this.field1973.field11369 * arg0, (byte)124);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1980[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method358(boolean arg0) {
      try {
         ++field1971;
         super.method358(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1980[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method1216(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method979(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            field1974 = null;
         }

         ++field1979;
         return super.method1659(-86, super.field2702.field11148, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1980[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method350(int arg0) {
      try {
         ++field1972;
         if (arg0 < 77) {
            field1977 = false;
         }

         return super.method350(87);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1980[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "<init>",
      descriptor = "(Lqs;Lob;Z)V"
   )
   public class123(class771 arg0, class779 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field1973 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1980[6] + (arg0 != null ? field1980[4] : field1980[5]) + ',' + (arg1 != null ? field1980[4] : field1980[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1218(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
