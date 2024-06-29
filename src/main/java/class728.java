import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class728 implements class165 {
   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "Lnda;"
   )
   private class587 field10668;
   @OriginalMember(
      owner = "client!sea",
      name = "i",
      descriptor = "[I"
   )
   public int[] field10671;
   @OriginalMember(
      owner = "client!sea",
      name = "h",
      descriptor = "I"
   )
   public int field10665;
   @OriginalMember(
      owner = "client!sea",
      name = "f",
      descriptor = "I"
   )
   public int field10660;
   @OriginalMember(
      owner = "client!sea",
      name = "e",
      descriptor = "Lsk;"
   )
   private class654 field10662;
   @OriginalMember(
      owner = "client!sea",
      name = "k",
      descriptor = "[F"
   )
   public float[] field10666;
   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10672 = new String[]{method5299(method5298("`\u0002?->;")), method5299(method5298("`\u0002?-=;")), method5299(method5298("`\u0002?-9;")), method5299(method5298("hIp-\u0001")), method5299(method5298("}\u00122o")), method5299(method5298("`\u0002?-@z\t7wB;")), method5299(method5298("`\u0002?-8;")), method5299(method5298("`\u0002?-?;"))};
   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field10670 = new byte[1000][];
   @OriginalMember(
      owner = "client!sea",
      name = "m",
      descriptor = "I"
   )
   public static int field10659;
   @OriginalMember(
      owner = "client!sea",
      name = "c",
      descriptor = "I"
   )
   public static int field10661;
   @OriginalMember(
      owner = "client!sea",
      name = "d",
      descriptor = "I"
   )
   public static int field10663;
   @OriginalMember(
      owner = "client!sea",
      name = "g",
      descriptor = "I"
   )
   public static int field10664;
   @OriginalMember(
      owner = "client!sea",
      name = "l",
      descriptor = "I"
   )
   public static int field10667;
   @OriginalMember(
      owner = "client!sea",
      name = "j",
      descriptor = "Ldl;"
   )
   public static class69 field10669;

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(III)Leb;"
   )
   public static final class657 method5295(int arg0, int arg1, int arg2) {
      try {
         ++field10663;
         class657 var3 = class420.method3176(arg0, arg2 ^ -117);
         if (arg1 == arg2) {
            return var3;
         } else {
            return var3 != null && var3.field9350 != null && ~var3.field9350.length < ~arg1 ? var3.field9350[arg1] : null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10672[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5296(int arg0) {
      try {
         field10669 = null;
         field10670 = null;
         if (arg0 != 3111) {
            field10670 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10672[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         ++field10664;
         class291.method2191(!arg6 ? null : this.field10668.field8058.field8712, arg5, this.field10668.field8058.field8711, arg2, this.field10665, arg0, arg7 ? this.field10666 : null, 0, arg7 ? this.field10668.field8088 : null, this.field10671, arg4, arg3, arg1);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10672[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class291.method2191(!arg6 ? null : this.field10671, arg5, this.field10665, arg2, this.field10668.field8058.field8711, arg0, !arg7 ? null : this.field10668.field8088, 0, !arg7 ? null : this.field10666, this.field10668.field8058.field8712, arg4, arg3, arg1);
         ++field10659;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field10672[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "<init>",
      descriptor = "(Lnda;Lbo;Lsk;)V"
   )
   public class728(class587 arg0, class763 arg1, class654 arg2) {
      try {
         label55: {
            this.field10668 = arg0;
            if (arg1 instanceof class400) {
               class400 var4 = (class400)arg1;
               this.field10671 = var4.field5620;
               this.field10665 = var4.field11407;
               this.field10660 = var4.field11393;
               if (!client.field4273) {
                  break label55;
               }
            }

            if (!(arg1 instanceof class272)) {
               throw new RuntimeException();
            }

            class272 var5 = (class272)arg1;
            this.field10671 = var5.field3645;
            this.field10660 = var5.field11393;
            this.field10665 = var5.field11407;
         }

         if (arg2 != null) {
            this.field10662 = arg2;
            if (~this.field10662.field9149 == ~this.field10665 && ~this.field10662.field9147 == ~this.field10660) {
               this.field10666 = this.field10662.field9150;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10672[5] + (arg0 != null ? field10672[3] : field10672[4]) + ',' + (arg1 != null ? field10672[3] : field10672[4]) + ',' + (arg2 != null ? field10672[3] : field10672[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(IB)[I"
   )
   public static final int[] method5297(int arg0, byte arg1) {
      try {
         ++field10661;
         int var2 = -97 / ((-15 - arg1) / 57);
         int[] var3 = new int[3];
         class621.method4518((byte)-2, class402.method3045(-20138, arg0));
         var3[0] = class624.field8714.get(5);
         var3[1] = class624.field8714.get(2);
         var3[2] = class624.field8714.get(1);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10672[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
