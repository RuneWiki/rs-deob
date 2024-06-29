import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 extends class689 {
   @OriginalMember(
      owner = "client!ds",
      name = "y",
      descriptor = "I"
   )
   private int field195;
   @OriginalMember(
      owner = "client!ds",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field198 = new String[]{method120(method119(":w=\u0005\"")), method120(method119(":w=\u0001\"")), method120(method119("%*=bw")), method120(method119("0q\u007f ")), method120(method119(":w=pc0mgr\"")), method120(method119(":w=\u0000\"")), method120(method119(":w=\u0006\"")), method120(method119(":w=\u0002\""))};
   @OriginalMember(
      owner = "client!ds",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field194 = false;
   @OriginalMember(
      owner = "client!ds",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field196 = false;
   @OriginalMember(
      owner = "client!ds",
      name = "G",
      descriptor = "F"
   )
   public static float field197;
   @OriginalMember(
      owner = "client!ds",
      name = "F",
      descriptor = "I"
   )
   public static int field190;
   @OriginalMember(
      owner = "client!ds",
      name = "C",
      descriptor = "I"
   )
   public static int field191;
   @OriginalMember(
      owner = "client!ds",
      name = "E",
      descriptor = "I"
   )
   public static int field192;
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "I"
   )
   public static int field193;
   @OriginalMember(
      owner = "client!ds",
      name = "A",
      descriptor = "Lnia;"
   )
   public static class671 field189;

   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "(ZI)V",
      line = 3
   )
   public final void method113(boolean arg0, int arg1) {
      try {
         ++field192;
         if (arg1 == 3589) {
            super.field10381.method4818((byte)-117, this);
            OpenGL.glTexParameteri(super.field10376, 10242, !arg0 ? 33071 : 10497);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field198[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(Z)V",
      line = 15
   )
   public static void method114(boolean arg0) {
      try {
         if (arg0) {
            field189 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field198[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(III)V",
      line = 27
   )
   public static final void method115(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      if (var3 != null) {
         class29.method205(var3.field922);
         class29.method205(var3.field913);
         if (var3.field922 != null) {
            var3.field922 = null;
         }

         if (var3.field913 != null) {
            var3.field913 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(ZZIII)V",
      line = 42
   )
   public static final void method116(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
      try {
         class377.method2918(arg1, arg0, 0, arg4, class433.field6609.length + -1, arg2, 112);
         ++field193;
         class42.field458 = 0;
         if (arg3 <= 56) {
            method115(60, 116, -42);
         }

         class339.field5143 = null;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field198[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "<init>",
      descriptor = "(Lck;II[BI)V",
      line = 58
   )
   public class16(class667 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field195 = arg2;
         super.field10381.method4818((byte)48, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field10376, 0, super.field10369, this.field195, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5012(true, -10161);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field198[4] + (arg0 != null ? field198[2] : field198[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field198[2] : field198[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(B)V",
      line = 77
   )
   public final void method117(byte arg0) {
      try {
         int var2 = 37 % ((arg0 - 26) / 55);
         ++field190;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field198[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(BLeaa;)I",
      line = 90
   )
   public static final int method118(byte arg0, class526 arg1) {
      try {
         ++field191;
         int var2 = 0;
         if (arg1.method3884((byte)-99, class334.field4776)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class132.field1652)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class518.field7552)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class532.field7776)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class348.field5288)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class309.field4403)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class675.field10135)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class352.field5347)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class577.field8573)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class225.field2895)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class309.field4399)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class290.field4069)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class205.field2632)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class687.field10358)) {
            ++var2;
         }

         if (arg0 != -64) {
            method115(-12, 106, -86);
         }

         if (arg1.method3884((byte)-99, class639.field9305)) {
            ++var2;
         }

         if (arg1.method3884((byte)-99, class382.field5862)) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field198[1] + arg0 + ',' + (arg1 != null ? field198[2] : field198[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method119(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method120(char[] arg0) {
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
            var10005 = 4;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
