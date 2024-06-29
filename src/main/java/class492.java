import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class492 {
   @OriginalMember(
      owner = "client!vaa",
      name = "f",
      descriptor = "Lgw;"
   )
   private class179 field7161 = new class179(64);
   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "Lhw;"
   )
   private class141 field7158;
   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "Lhw;"
   )
   private class141 field7159;
   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7168 = new String[]{method3714(method3713("\u0018g\nx+F")), method3714(method3713("\u0000s\u0007:")), method3714(method3713("\u0015(Ex\u0017")), method3714(method3713("\u0018g\nxV\u0007h\u0002\"TF")), method3714(method3713("\u0018g\nx(F")), method3714(method3713("\u0018g\nx)F"))};
   @OriginalMember(
      owner = "client!vaa",
      name = "i",
      descriptor = "I"
   )
   public static int field7163 = 0;
   @OriginalMember(
      owner = "client!vaa",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field7162 = new int[500];
   @OriginalMember(
      owner = "client!vaa",
      name = "c",
      descriptor = "Liw;"
   )
   public static class332 field7160 = new class332();
   @OriginalMember(
      owner = "client!vaa",
      name = "h",
      descriptor = "Lgh;"
   )
   public static class572 field7167 = new class572(6, -1);
   @OriginalMember(
      owner = "client!vaa",
      name = "e",
      descriptor = "I"
   )
   public static int field7164;
   @OriginalMember(
      owner = "client!vaa",
      name = "d",
      descriptor = "I"
   )
   public static int field7165;
   @OriginalMember(
      owner = "client!vaa",
      name = "j",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field7166;

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method3710(boolean arg0) {
      try {
         if (!arg0) {
            field7163 = 60;
         }

         field7166 = null;
         field7160 = null;
         field7167 = null;
         field7162 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7168[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "<init>",
      descriptor = "(ILhw;Lhw;)V",
      line = 99
   )
   public class492(int arg0, class141 arg1, class141 arg2) {
      try {
         this.field7158 = arg1;
         this.field7159 = arg2;
         if (this.field7158 != null) {
            this.field7158.method1346(0, 0);
         }

         if (this.field7159 != null) {
            this.field7159.method1346(0, 0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7168[3] + arg0 + ',' + (arg1 != null ? field7168[2] : field7168[1]) + ',' + (arg2 != null ? field7168[2] : field7168[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(IIII)V",
      line = 46
   )
   public static final void method3711(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg1 != 11361) {
            field7163 = -103;
         }

         ++field7164;
         class536 var4 = class108.method1038((long)arg3, 67, 9);
         var4.method4017(arg1 ^ 29293);
         var4.field7800 = arg0;
         var4.field7798 = arg2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7168[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(IB)Lre;",
      line = 61
   )
   public final class625 method3712(int arg0, byte arg1) {
      try {
         ++field7165;
         class625 var3 = (class625)this.field7161.method1584((long)arg0, 1);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label29: {
               if (~arg0 > -32769) {
                  var4 = this.field7158.method1347((byte)125, 0, arg0);
                  if (!client.field4564) {
                     break label29;
                  }
               }

               var4 = this.field7159.method1347((byte)127, 0, arg0 & 32767);
            }

            class625 var5 = new class625();
            if (arg1 != -83) {
               method3710(true);
            }

            if (var4 != null) {
               var5.method4576(false, new class473(var4));
            }

            if (arg0 >= 32768) {
               var5.method4575(32768);
            }

            this.field7161.method1581((long)arg0, arg1 + 83, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7168[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3713(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3714(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
