import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class82 {
   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1159 = new String[]{method799(method798("\u007f\n\u0006v$&")), method799(method798("\u007f\n\u0006w$&")), method799(method798("\u007f\n\u0006p$&"))};
   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "I"
   )
   public static int field1153;
   @OriginalMember(
      owner = "client!qq",
      name = "f",
      descriptor = "I"
   )
   public static int field1155;
   @OriginalMember(
      owner = "client!qq",
      name = "e",
      descriptor = "I"
   )
   public static int field1156;
   @OriginalMember(
      owner = "client!qq",
      name = "d",
      descriptor = "I"
   )
   public static int field1158;
   @OriginalMember(
      owner = "client!qq",
      name = "b",
      descriptor = "Lqq;"
   )
   public class82 field1154;
   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "Lqq;"
   )
   public class82 field1157;

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(II)Loca;"
   )
   public static final class642 method795(int arg0, int arg1) {
      try {
         ++field1156;
         if (arg1 != -26545) {
            field1158 = -127;
         }

         int var2 = arg0 >> 16;
         int var3 = arg0 & 65535;
         if (class419.field5722[var2] == null || class419.field5722[var2][var3] == null) {
            boolean var4 = class792.method5717((byte)-41, var2);
            if (!var4) {
               return null;
            }
         }

         return class419.field5722[var2][var3];
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1159[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "a",
      descriptor = "(IIB)I"
   )
   public static final int method796(int arg0, int arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         ++field1155;
         int var4 = 1;
         if (var3) {
            if (~(arg0 & 1) != -1) {
               var4 = arg1 * var4;
            }

            arg0 >>= 1;
            arg1 *= arg1;
         }

         while(true) {
            int var10000;
            byte var10001;
            if (arg0 <= 1) {
               var10000 = arg2;
               var10001 = 58;
               if (!var3) {
                  if (arg2 < 58) {
                     return 114;
                  }

                  if (arg0 == 1) {
                     return arg1 * var4;
                  }

                  return var4;
               }
            } else {
               var10000 = ~(arg0 & 1);
               var10001 = -1;
            }

            if (var10000 != var10001) {
               var4 = arg1 * var4;
            }

            arg0 >>= 1;
            arg1 *= arg1;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1159[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method797(byte arg0) {
      try {
         ++field1153;
         if (this.field1154 != null) {
            this.field1154.field1157 = this.field1157;
            this.field1157.field1154 = this.field1154;
            if (arg0 <= 62) {
               method795(-122, -52);
            }

            this.field1157 = null;
            this.field1154 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1159[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method798(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method799(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
