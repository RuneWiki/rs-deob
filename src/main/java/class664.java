import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class664 {
   @OriginalMember(
      owner = "client!ds",
      name = "d",
      descriptor = "I"
   )
   private int field9363;
   @OriginalMember(
      owner = "client!ds",
      name = "j",
      descriptor = "Z"
   )
   private boolean field9366;
   @OriginalMember(
      owner = "client!ds",
      name = "l",
      descriptor = "I"
   )
   private int field9356;
   @OriginalMember(
      owner = "client!ds",
      name = "m",
      descriptor = "Laea;"
   )
   public class678 field9357;
   @OriginalMember(
      owner = "client!ds",
      name = "h",
      descriptor = "I"
   )
   public int field9358;
   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9367 = new String[]{method4831(method4830("!\u0019,eo")), method4831(method4830(">D,\n:")), method4831(method4830("+\u001fnH")), method4831(method4830("!\u0019,\u0018.+\u0003v\u001ao")), method4831(method4830("!\u0019,oo")), method4831(method4830("!\u0019,mo")), method4831(method4830("!\u0019,B.+\u000bnM= B")), method4831(method4830("!\u0019,no"))};
   @OriginalMember(
      owner = "client!ds",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field9354 = true;
   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "I"
   )
   public static int field9355;
   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "I"
   )
   public static int field9359;
   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "I"
   )
   public static int field9360;
   @OriginalMember(
      owner = "client!ds",
      name = "f",
      descriptor = "I"
   )
   public static int field9361;
   @OriginalMember(
      owner = "client!ds",
      name = "i",
      descriptor = "I"
   )
   public static int field9364;
   @OriginalMember(
      owner = "client!ds",
      name = "e",
      descriptor = "I"
   )
   public static int field9365;
   @OriginalMember(
      owner = "client!ds",
      name = "k",
      descriptor = "Lma;"
   )
   public static class148 field9362;

   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method2084(byte arg0);

   @OriginalMember(
      owner = "client!ds",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4826(int arg0) {
      try {
         field9362 = null;
         if (arg0 != 1) {
            field9362 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9367[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(CI)I"
   )
   public static final int method4827(char arg0, int arg1) {
      try {
         ++field9355;
         return arg1 >= ~arg0 && ~arg0 > ~class451.field6579.length ? class451.field6579[arg0] : -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9367[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method4828(boolean arg0) {
      try {
         ++field9361;
         class476.field6870.method4707(1, false, class476.field6870.field9127);
         class476.field6870.method4707(1, false, class476.field6870.field9133);
         class476.field6870.method4707(2, false, class476.field6870.field9110);
         class476.field6870.method4707(2, false, class476.field6870.field9145);
         class476.field6870.method4707(1, !arg0, class476.field6870.field9151);
         class476.field6870.method4707(1, false, class476.field6870.field9119);
         class476.field6870.method4707(1, !arg0, class476.field6870.field9104);
         class476.field6870.method4707(1, false, class476.field6870.field9126);
         class476.field6870.method4707(1, false, class476.field6870.field9148);
         class476.field6870.method4707(1, false, class476.field6870.field9138);
         class476.field6870.method4707(2, !arg0, class476.field6870.field9118);
         class476.field6870.method4707(1, false, class476.field6870.field9128);
         class476.field6870.method4707(2, !arg0, class476.field6870.field9149);
         class476.field6870.method4707(1, false, class476.field6870.field9117);
         class476.field6870.method4707(0, false, class476.field6870.field9147);
         class476.field6870.method4707(0, false, class476.field6870.field9146);
         class476.field6870.method4707(2, !arg0, class476.field6870.field9140);
         class476.field6870.method4707(0, false, class476.field6870.field9150);
         class476.field6870.method4707(0, false, class476.field6870.field9142);
         class476.field6870.method4707(1, false, class476.field6870.field9141);
         class267.method2281(2);
         class476.field6870.method4707(0, !arg0, class476.field6870.field9108);
         class476.field6870.method4707(4, false, class476.field6870.field9105);
         class345.method2741(0);
         class215.method1854((byte)-128);
         class350.field5131 = arg0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9367[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field9357.method4961(0, this.field9356, this.field9358);
         ++field9359;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9367[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "a",
      descriptor = "(II[B)V"
   )
   public final void method4829(int arg0, int arg1, byte[] arg2) {
      try {
         if (arg0 != 1) {
            field9364 = -82;
         }

         this.method2084((byte)17);
         ++field9365;
         if (this.field9356 < arg1) {
            OpenGL.glBufferDataARBub(this.field9363, arg1, arg2, 0, !this.field9366 ? 35044 : 35040);
            this.field9357.field9697 += -this.field9356 + arg1;
            this.field9356 = arg1;
         } else {
            OpenGL.glBufferSubDataARBub(this.field9363, 0, arg1, arg2, 0);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9367[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9367[1] : field9367[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "<init>",
      descriptor = "(Laea;I[BIZ)V"
   )
   public class664(class678 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         this.field9363 = arg1;
         this.field9366 = arg4;
         this.field9356 = arg3;
         this.field9357 = arg0;
         OpenGL.glGenBuffersARB(1, class28.field418, 0);
         this.field9358 = class28.field418[0];
         this.method2084((byte)17);
         OpenGL.glBufferDataARBub(arg1, this.field9356, arg2, 0, this.field9366 ? 35040 : 35044);
         this.field9357.field9697 += this.field9356;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9367[3] + (arg0 != null ? field9367[1] : field9367[2]) + ',' + arg1 + ',' + (arg2 != null ? field9367[1] : field9367[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "<init>",
      descriptor = "(Laea;ILjaclib/memory/Buffer;IZ)V"
   )
   public class664(class678 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      try {
         this.field9366 = arg4;
         this.field9363 = arg1;
         this.field9356 = arg3;
         this.field9357 = arg0;
         OpenGL.glGenBuffersARB(1, class28.field418, 0);
         this.field9358 = class28.field418[0];
         this.method2084((byte)17);
         OpenGL.glBufferDataARBa(arg1, this.field9356, arg2.getAddress(), this.field9366 ? 35040 : 35044);
         this.field9357.field9697 += this.field9356;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field9367[3] + (arg0 != null ? field9367[1] : field9367[2]) + ',' + arg1 + ',' + (arg2 != null ? field9367[1] : field9367[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ds",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
