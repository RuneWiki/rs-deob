import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class61 extends class305 {
   @OriginalMember(
      owner = "client!mk",
      name = "y",
      descriptor = "[B"
   )
   public byte[] field1151;
   @OriginalMember(
      owner = "client!mk",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1155 = new String[]{method671(method670("\u001eq\u0000\u0006X\u001dsZ\u0004\u0019")), method671(method670("\u001doBV")), method671(method670("\b4\u0000\u0014L")), method671(method670("\u001eq\u0000x\u0019")), method671(method670("\u001eq\u0000y\u0019")), method671(method670("\u001eq\u0000{\u0019"))};
   @OriginalMember(
      owner = "client!mk",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field1149 = new int[13];
   @OriginalMember(
      owner = "client!mk",
      name = "B",
      descriptor = "Luw;"
   )
   public static class435 field1147 = new class435(56, 8);
   @OriginalMember(
      owner = "client!mk",
      name = "x",
      descriptor = "I"
   )
   public static int field1154 = 1400;
   @OriginalMember(
      owner = "client!mk",
      name = "v",
      descriptor = "Luw;"
   )
   public static class435 field1153 = new class435(61, 16);
   @OriginalMember(
      owner = "client!mk",
      name = "C",
      descriptor = "D"
   )
   public static double field1150;
   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "I"
   )
   public static int field1148;
   @OriginalMember(
      owner = "client!mk",
      name = "A",
      descriptor = "I"
   )
   public static int field1152;

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(IZII)V"
   )
   public static final void method667(int arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field4564;

      try {
         label53: {
            if (~arg3 == -1013) {
               class161.method1473(class489.field7138, arg2, arg0);
               if (!var4) {
                  break label53;
               }
            }

            if (arg3 == 1008) {
               class161.method1473(class663.field9636, arg2, arg0);
               if (!var4) {
                  break label53;
               }
            }

            if (~arg3 != -1002) {
               if (arg3 == 1009) {
                  class161.method1473(class304.field4401, arg2, arg0);
                  if (!var4) {
                     break label53;
                  }
               }

               if (~arg3 != -1003) {
                  break label53;
               }

               class161.method1473(class147.field2383, arg2, arg0);
               if (!var4) {
                  break label53;
               }
            }

            class161.method1473(class112.field1808, arg2, arg0);
         }

         ++field1152;
         if (arg1) {
            method667(-1, true, -85, 12);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1155[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method668(boolean arg0) {
      try {
         if (arg0) {
            field1154 = -108;
         }

         class59.field1130.method2580((byte)-4);
         ++field1148;
         class782.field11454 = 0;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1155[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method669(int arg0) {
      try {
         if (arg0 != -1013) {
            field1149 = null;
         }

         field1147 = null;
         field1149 = null;
         field1153 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1155[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class61(byte[] arg0) {
      try {
         this.field1151 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1155[0] + (arg0 != null ? field1155[2] : field1155[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method670(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method671(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
