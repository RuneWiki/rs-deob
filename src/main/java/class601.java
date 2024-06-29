import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class601 extends class799 {
   @OriginalMember(
      owner = "client!sba",
      name = "w",
      descriptor = "I"
   )
   private int field8799;
   @OriginalMember(
      owner = "client!sba",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8802 = new String[]{method4450(method4449("];$&%\u0006")), method4450(method4449("];$&!\u0006")), method4450(method4449("];$&XG7,|Z\u0006")), method4450(method4449("@,)d")), method4450(method4449("Uwk&\u0019")), method4450(method4449("];$&&\u0006"))};
   @OriginalMember(
      owner = "client!sba",
      name = "y",
      descriptor = "I"
   )
   public static int field8797 = 0;
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "I"
   )
   public static int field8796;
   @OriginalMember(
      owner = "client!sba",
      name = "B",
      descriptor = "I"
   )
   public static int field8798;
   @OriginalMember(
      owner = "client!sba",
      name = "x",
      descriptor = "I"
   )
   public static int field8800;
   @OriginalMember(
      owner = "client!sba",
      name = "A",
      descriptor = "I"
   )
   public static int field8801;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method4447(boolean arg0, boolean arg1) {
      try {
         super.field11637.method4792(-26367, this);
         ++field8801;
         OpenGL.glTexParameteri(super.field11642, 10242, arg1 ? 10497 : 33071);
         if (arg0) {
            this.field8799 = 56;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8802[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4448(int arg0, int arg1) {
      try {
         if (arg0 <= 39) {
            field8797 = -64;
         }

         ++field8796;
         class388.field6093 = arg1;
         class475.field7226.method2551(true);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8802[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1683(byte arg0) {
      try {
         if (arg0 != -117) {
            this.method4447(true, true);
         }

         ++field8800;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8802[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(Lc;II[BI)V"
   )
   public class601(class652 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field8799 = arg2;
         super.field11637.method4792(-26367, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field11642, 0, super.field11630, this.field8799, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5760(true, (byte)-107);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8802[2] + (arg0 != null ? field8802[4] : field8802[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8802[4] : field8802[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
