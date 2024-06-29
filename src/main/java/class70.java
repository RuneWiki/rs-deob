import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class70 extends RuntimeException {
   @OriginalMember(
      owner = "client!qn",
      name = "e",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field1248;
   @OriginalMember(
      owner = "client!qn",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field1249;
   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1257 = new String[]{method749(method748("G_\u0017Ze")), method749(method748("XDUu")), method749(method748("M\u001f\u001770")), method749(method748("G_\u0017[e"))};
   @OriginalMember(
      owner = "client!qn",
      name = "f",
      descriptor = "I"
   )
   public static int field1252 = 0;
   @OriginalMember(
      owner = "client!qn",
      name = "h",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field1255 = null;
   @OriginalMember(
      owner = "client!qn",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field1253 = new int[500];
   @OriginalMember(
      owner = "client!qn",
      name = "c",
      descriptor = "I"
   )
   public static int field1256 = 0;
   @OriginalMember(
      owner = "client!qn",
      name = "i",
      descriptor = "I"
   )
   public static int field1250;
   @OriginalMember(
      owner = "client!qn",
      name = "g",
      descriptor = "I"
   )
   public static int field1251;
   @OriginalMember(
      owner = "client!qn",
      name = "b",
      descriptor = "I"
   )
   public static int field1254;
   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "Lfg;"
   )
   public static class139 field1247;

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method745(int arg0) {
      field1255 = null;
      if (arg0 != 1) {
         field1253 = null;
      }

      field1253 = null;
      field1247 = null;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         label55: {
            if (~arg3 != -9 && ~arg3 != -17) {
               class600 var8 = class90.field1473[arg5][arg4][arg0];
               if (var8 == null) {
                  var8 = new class600(arg5);
               }

               label45: {
                  if (arg3 == 1) {
                     var8.field8655 = (short)arg1;
                     var8.field8663 = (short)arg2;
                     if (!var7) {
                        break label45;
                     }
                  }

                  if (arg3 == 2) {
                     var8.field8652 = (short)arg1;
                     var8.field8662 = (short)arg2;
                  }
               }

               if (!class759.field11020) {
                  break label55;
               }

               class583.method4327(-10073);
               if (!var7) {
                  break label55;
               }
            }

            if (~arg3 == -9) {
               int var9 = arg4 << class76.field1336;
               int var10 = class57.field1124 + var9;
               int var11 = arg0 << class76.field1336;
               int var12 = class57.field1124 + var11;
               int var13 = class530.field7721[arg5].method2289(arg4, arg0, (byte)127);
               int var14 = class530.field7721[arg5].method2289(arg4 + 1, arg0 - -1, (byte)126);
               class256.field3636[class778.field11382++] = new class743(arg3, arg5, var9, var10, var10, var9, var13, var14, -arg1 + var14, var13 - arg1, var11, var12, var12, var11);
               if (!var7) {
                  break label55;
               }
            }

            int var15 = (arg4 << class76.field1336) - -class57.field1124;
            int var16 = -class57.field1124 + var15;
            int var17 = arg0 << class76.field1336;
            int var18 = class57.field1124 + var17;
            int var19 = class530.field7721[arg5].method2289(arg4 + 1, arg0, (byte)110);
            int var20 = class530.field7721[arg5].method2289(arg4, arg0 + 1, (byte)127);
            class256.field3636[class778.field11382++] = new class743(arg3, arg5, var15, var16, var16, var15, var19, var20, -arg1 + var20, -arg1 + var19, var17, var18, var18, var17);
         }

         ++field1250;
         if (arg6 != 1) {
            method746(-100, 110, 74, 35, -73, 45, 102);
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field1257[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V"
   )
   public class70(Throwable arg0, String arg1) {
      this.field1248 = arg0;
      this.field1249 = arg1;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method747(String arg0, int arg1) {
      try {
         if (arg1 != -9) {
            return -70;
         } else {
            ++field1251;
            return arg0.length() + 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1257[0] + (arg0 != null ? field1257[2] : field1257[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method748(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method749(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
