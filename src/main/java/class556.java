import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class556 extends class775 {
   @OriginalMember(
      owner = "client!si",
      name = "y",
      descriptor = "I"
   )
   private int field8297 = -1;
   @OriginalMember(
      owner = "client!si",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8301 = new String[]{method4216(method4215("\biQ\u001a")), method4216(method4215("\u0015u\u00135j")), method4216(method4215("\u001d2\u0013X?")), method4216(method4215("\u0015u\u00134j")), method4216(method4215("\u0015u\u00137j"))};
   @OriginalMember(
      owner = "client!si",
      name = "v",
      descriptor = "[[Z"
   )
   public static boolean[][] field8294 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!si",
      name = "t",
      descriptor = "I"
   )
   public static int field8300 = 0;
   @OriginalMember(
      owner = "client!si",
      name = "u",
      descriptor = "B"
   )
   private byte field8298;
   @OriginalMember(
      owner = "client!si",
      name = "x",
      descriptor = "I"
   )
   public static int field8295;
   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "I"
   )
   public static int field8296;
   @OriginalMember(
      owner = "client!si",
      name = "w",
      descriptor = "I"
   )
   public static int field8299;

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 8
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         arg0.method1935(this.field8298, this.field8297, 1);
         int var3 = 3 / ((-23 - arg1) / 45);
         ++field8296;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8301[4] + (arg0 != null ? field8301[2] : field8301[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(I)V",
      line = 33
   )
   public static void method4214(int arg0) {
      try {
         if (arg0 <= 72) {
            field8294 = null;
         }

         field8294 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8301[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 44
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field8299;
         int var3 = 123 % ((-84 - arg1) / 34);
         this.field8297 = arg0.method2848(-110);
         this.field8298 = arg0.method2886((byte)88);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8301[1] + (arg0 != null ? field8301[2] : field8301[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!si",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
