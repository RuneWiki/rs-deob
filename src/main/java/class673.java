import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class673 extends class486 {
   @OriginalMember(
      owner = "client!lca",
      name = "u",
      descriptor = "I"
   )
   private int field9751;
   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9756 = new String[]{method4896(method4895("\u0000\u0004\u0007\u001b6D")), method4896(method4895("\u0002\u0012\nY")), method4896(method4895("\u0017IH\u001b\n")), method4896(method4895("\u0000\u0004\u0007\u001bK\u0005\t\u000fAID")), method4896(method4895("\u0000\u0004\u0007\u001b5D")), method4896(method4895("\u0003\u0013\u000eP\u0005\u0000\u0002\u0010P\u001b")), method4896(method4895("\u000f\b\u000bE\u0016\u001f\u0014")), method4896(method4895("\u0004\u000e\u0012X\u0016\u001e\f\u0015")), method4896(method4895("\u0001\u0006\u0016Q\u0018\u0018\u0014")), method4896(method4895("\u0004\u0002\u0007Q\u001e\u000f\b\bF(\u001c\u0015\u0007L\u0012\u001e")), method4896(method4895("\u0004\u000e\u0012W\u0016\u001e8\u0002P\u0011\r\u0012\nA")), method4896(method4895("\u0004\u000e\bA(\u0004\u0002\u0007Q\u001e\u000f\b\bF")), method4896(method4895("\u0004\u0002\u0007Q\u001e\u000f\b\bF(\u001c\f")), method4896(method4895("\u0000\u0004\u0007\u001b4D")), method4896(method4895("\u0018\u000e\u000bP\u0005\u000e\u0006\u0014j\u0013\t\u0001\u0007@\u001b\u0018")), method4896(method4895("\u0004\u000e\bA(\u0001\u0006\u0016X\u0016\u001e\f\u0003G\u0004")), method4896(method4895("\u0004\u000e\bA(\u0001\u0006\u0016P\u0013\u000b\u0002")), method4896(method4895("\u000f\u0015\tF\u0004")), method4896(method4895("\u0002\u0006\u000bP(\u0005\u0004\t[\u0004")), method4896(method4895("\u0001\u0006\u0016S\u001b\r\u0000")), method4896(method4895("\u001f\u0004\u0014Z\u001b\u0000\u0005\u0007G")), method4896(method4895("\n\u000b\tZ\u0005\u001f\u000f\u0007Q\u0018\u001b\u0014"))};
   @OriginalMember(
      owner = "client!lca",
      name = "v",
      descriptor = "I"
   )
   public static int field9755 = 0;
   @OriginalMember(
      owner = "client!lca",
      name = "t",
      descriptor = "I"
   )
   public static int field9752;
   @OriginalMember(
      owner = "client!lca",
      name = "s",
      descriptor = "I"
   )
   public static int field9753;
   @OriginalMember(
      owner = "client!lca",
      name = "w",
      descriptor = "I"
   )
   public static int field9754;

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method4893(boolean arg0, boolean arg1) {
      try {
         ++field9752;
         super.field6940.method4107(-123, this);
         if (arg1) {
            this.method1678(-29);
         }

         OpenGL.glTexParameteri(super.field6938, 10242, arg0 ? 10497 : 33071);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9756[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Lkf;B)V"
   )
   public static final void method4894(class266 arg0, byte arg1) {
      try {
         class524.field7517 = arg0.method2031(0, field9756[7]);
         ++field9754;
         class74.field913 = arg0.method2031(0, field9756[10]);
         class666.field9669 = arg0.method2031(arg1 ^ -76, field9756[14]);
         class172.field2395 = arg0.method2031(0, field9756[12]);
         class281.field3907 = arg0.method2031(0, field9756[9]);
         class607.field8904 = arg0.method2031(0, field9756[11]);
         class549.field7864 = arg0.method2031(0, field9756[15]);
         class80.field1028 = arg0.method2031(0, field9756[19]);
         class400.field5788 = arg0.method2031(0, field9756[17]);
         class403.field5825 = arg0.method2031(0, field9756[8]);
         class677.field9799 = arg0.method2031(0, field9756[20]);
         class581.field8548 = arg0.method2031(0, field9756[18]);
         if (arg1 != -76) {
            method4894((class266)null, (byte)29);
         }

         class290.field4011 = arg0.method2031(0, field9756[21]);
         class470.field6753 = arg0.method2031(0, field9756[6]);
         class763.field11276 = arg0.method2031(0, field9756[5]);
         class165.field2328 = arg0.method2031(0, field9756[16]);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9756[13] + (arg0 != null ? field9756[2] : field9756[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1678(int arg0) {
      try {
         ++field9753;
         if (arg0 != 0) {
            field9755 = 16;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9756[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "<init>",
      descriptor = "(Lea;II[BI)V"
   )
   public class673(class573 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field9751 = arg2;
         super.field6940.method4107(-120, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field6938, 0, super.field6948, this.field9751, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method3526(true, 32);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9756[3] + (arg0 != null ? field9756[2] : field9756[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9756[2] : field9756[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4895(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4896(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
