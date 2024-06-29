import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class105 extends class500 {
   @OriginalMember(
      owner = "client!qu",
      name = "m",
      descriptor = "I"
   )
   public int field1334;
   @OriginalMember(
      owner = "client!qu",
      name = "j",
      descriptor = "I"
   )
   public int field1333;
   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1335 = new String[]{method938(method937("X(N\tf")), method938(method937("X(Nw'G4\u0014uf")), method938(method937("X(N\bf")), method938(method937("G(\f'")), method938(method937("RsNe3"))};
   @OriginalMember(
      owner = "client!qu",
      name = "k",
      descriptor = "I"
   )
   public static int field1330;
   @OriginalMember(
      owner = "client!qu",
      name = "n",
      descriptor = "I"
   )
   public static int field1331;
   @OriginalMember(
      owner = "client!qu",
      name = "l",
      descriptor = "I"
   )
   public static int field1332;

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method934(int arg0, int arg1, int arg2) {
      try {
         ++field1332;
         if (arg0 != 16034) {
            return true;
         } else {
            return class40.method305(32768, arg1, arg2) | (2048 & arg1) != 0 || class302.method2276(arg2, (byte)114, arg1);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1335[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(Lvi;II)V"
   )
   public static final void method935(class569 arg0, int arg1, int arg2) {
      try {
         ++field1331;
         if (arg1 == 16777215) {
            if (arg0.field7789 != null) {
               int var3 = arg0.field7789[arg2 - -1];
               if (arg0.field7842 != var3) {
                  arg0.field7818 = 0;
                  arg0.field7830 = 1;
                  arg0.field7837 = 0;
                  arg0.field7769 = 0;
                  arg0.field7842 = var3;
                  arg0.field7856 = arg0.field7848;
                  if (~arg0.field7842 != 0) {
                     class779.method5586(arg0, class392.field5479.method1477(1, arg0.field7842), arg0.field7837, arg1 ^ -16756674);
                     return;
                  }
               }
            }

         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1335[2] + (arg0 != null ? field1335[4] : field1335[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method936(int arg0, int arg1) {
      return class175.field2177 != null ? class175.field2177[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class105(int arg0, int arg1) {
      try {
         this.field1334 = arg0;
         this.field1333 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1335[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method937(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method938(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
