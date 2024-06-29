import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class185 extends class297 {
   @OriginalMember(
      owner = "client!ria",
      name = "y",
      descriptor = "J"
   )
   public long field2907;
   @OriginalMember(
      owner = "client!ria",
      name = "w",
      descriptor = "Z"
   )
   public boolean field2901;
   @OriginalMember(
      owner = "client!ria",
      name = "D",
      descriptor = "I"
   )
   public int field2904;
   @OriginalMember(
      owner = "client!ria",
      name = "G",
      descriptor = "I"
   )
   public int field2898;
   @OriginalMember(
      owner = "client!ria",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field2903;
   @OriginalMember(
      owner = "client!ria",
      name = "B",
      descriptor = "I"
   )
   public int field2896;
   @OriginalMember(
      owner = "client!ria",
      name = "u",
      descriptor = "I"
   )
   public int field2902;
   @OriginalMember(
      owner = "client!ria",
      name = "x",
      descriptor = "Z"
   )
   public boolean field2908;
   @OriginalMember(
      owner = "client!ria",
      name = "N",
      descriptor = "I"
   )
   public int field2905;
   @OriginalMember(
      owner = "client!ria",
      name = "M",
      descriptor = "Ljava/lang/String;"
   )
   public String field2910;
   @OriginalMember(
      owner = "client!ria",
      name = "I",
      descriptor = "Z"
   )
   public boolean field2911;
   @OriginalMember(
      owner = "client!ria",
      name = "L",
      descriptor = "J"
   )
   public long field2895;
   @OriginalMember(
      owner = "client!ria",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2915 = new String[]{method1671(method1670("l\u001b\u0002gL6")), method1671(method1670("p\u0007\u000f%")), method1671(method1670("e\\Mgp")), method1671(method1670("l\u001b\u0002g1w\u001c\n=36")), method1671(method1670("l\u001b\u0002gO6")), method1671(method1670("t\u0010")), method1671(method1670("s\u0002")), method1671(method1670("l\u001b\u0002gN6"))};
   @OriginalMember(
      owner = "client!ria",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field2912 = false;
   @OriginalMember(
      owner = "client!ria",
      name = "H",
      descriptor = "I"
   )
   public static int field2900;
   @OriginalMember(
      owner = "client!ria",
      name = "v",
      descriptor = "I"
   )
   public static int field2906;
   @OriginalMember(
      owner = "client!ria",
      name = "F",
      descriptor = "I"
   )
   public static int field2909;
   @OriginalMember(
      owner = "client!ria",
      name = "O",
      descriptor = "Lpr;"
   )
   public static class331 field2897;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ria",
      name = "J",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2913;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2914;
   @OriginalMember(
      owner = "client!ria",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field2899;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1666(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field2909;
         int var2 = 0;
         Field[] var3 = (field2913 != null ? field2913 : (field2913 = method1669(field2915[6]))).getDeclaredFields();
         Field[] var4 = var3;
         int var5 = 0;
         if (!var1 && var5 >= var3.length) {
            return arg0 != -23 ? -18 : var2 + 1;
         } else {
            do {
               Field var6 = var4[var5];
               if ((field2914 != null ? field2914 : (field2914 = method1669(field2915[5]))).isAssignableFrom(var6.getType())) {
                  ++var2;
               }

               ++var5;
            } while(var5 < var4.length);

            if (arg0 != -23) {
               return -18;
            } else {
               return var2 + 1;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2915[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1667(int arg0, int arg1) {
      try {
         if (arg1 != -20728) {
            return -41;
         } else {
            ++field2906;
            return arg0 >>> 7;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2915[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1668(int arg0) {
      try {
         field2897 = null;
         if (arg0 != 0) {
            method1666((byte)61);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2915[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class185(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field2907 = arg5;
         this.field2901 = arg8;
         this.field2904 = arg7;
         this.field2898 = arg6;
         this.field2903 = arg0;
         this.field2896 = arg3;
         this.field2902 = arg2;
         this.field2908 = arg9;
         this.field2905 = arg4;
         this.field2910 = arg1;
         this.field2911 = arg11;
         this.field2895 = arg10;
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field2915[3] + (arg0 != null ? field2915[2] : field2915[1]) + ',' + (arg1 != null ? field2915[2] : field2915[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1669(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1670(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1671(char[] arg0) {
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
            var10005 = 114;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
