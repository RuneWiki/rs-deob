import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class759 {
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11231 = new String[]{method5511(method5510("R<[Oi\u001b")), method5511(method5510("]*V\r")), method5511(method5510("Hq\u0014OV")), method5511(method5510("R<[Oo\u001b")), method5511(method5510("R<[Oh\u001b")), method5511(method5510("R<[Oj\u001b"))};
   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field11229 = false;
   @OriginalMember(
      owner = "client!aca",
      name = "c",
      descriptor = "I"
   )
   public static int field11225;
   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "I"
   )
   public static int field11226;
   @OriginalMember(
      owner = "client!aca",
      name = "f",
      descriptor = "I"
   )
   public static int field11228;
   @OriginalMember(
      owner = "client!aca",
      name = "d",
      descriptor = "I"
   )
   public static int field11230;
   @OriginalMember(
      owner = "client!aca",
      name = "e",
      descriptor = "Lfi;"
   )
   public static class583 field11227;

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method5506(boolean arg0) {
      try {
         if (!arg0) {
            method5508(-116, (class266)null, true, -100, -110L, true, 51);
         }

         field11227 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11231[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(IZ)V",
      line = 15
   )
   public static final void method5507(int param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(ILkf;ZIJZI)V",
      line = 86
   )
   public static final void method5508(int arg0, class266 arg1, boolean arg2, int arg3, long arg4, boolean arg5, int arg6) {
      try {
         ++field11225;
         if (arg5) {
            field11229 = true;
         }

         class340.method2497(arg4, 0, arg1, arg6, arg3, (byte)37, arg2, arg0);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field11231[0] + arg0 + ',' + (arg1 != null ? field11231[2] : field11231[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(I)V",
      line = 102
   )
   public static final void method5509(int arg0) {
      try {
         if (arg0 != 0) {
            method5507(113, false);
         }

         class547.field7851 = new class678[class361.field4924.method2027((byte)-109)][];
         ++field11228;
         class428.field6127 = new class678[class361.field4924.method2027((byte)-119)][];
         class603.field8873 = new boolean[class361.field4924.method2027((byte)-101)];
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11231[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
