import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public abstract class class385 {
   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "I"
   )
   public int field5689;
   @OriginalMember(
      owner = "client!bfa",
      name = "f",
      descriptor = "I"
   )
   public int field5687;
   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "I"
   )
   public int field5688;
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5691 = new String[]{method2995(method2994("\u001eQ3\u0017tT")), method2995(method2994("\u001eQ3\u0017\u0002\u0015Y;M\u0000T")), method2995(method2994("\u001eQ3\u0017uT")), method2995(method2994("\u0007\u0019|\u0017C")), method2995(method2994("\u0012B>U")), method2995(method2994("\u001eQ3\u0017wT"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "I"
   )
   public static int field5684 = 0;
   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field5686 = new class435(89, 7);
   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "I"
   )
   public static int field5685;
   @OriginalMember(
      owner = "client!bfa",
      name = "g",
      descriptor = "I"
   )
   public static int field5690;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2991(byte arg0) {
      try {
         field5686 = null;
         if (arg0 > -17) {
            method2992(88, true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5691[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IZ)I",
      line = 16
   )
   public static final int method2992(int arg0, boolean arg1) {
      try {
         ++field5690;
         if (arg1) {
            method2992(-52, true);
         }

         return arg0 >>> 10;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5691[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "<init>",
      descriptor = "(III)V",
      line = 38
   )
   public class385(int arg0, int arg1, int arg2) {
      try {
         this.field5689 = arg0;
         this.field5687 = arg1;
         this.field5688 = arg2;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5691[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IIILha;IIIBILvia;II)V",
      line = 48
   )
   public static final void method2993(int arg0, int arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class587 arg9, int arg10, int arg11) {
      try {
         if (arg10 < arg5 && ~arg5 > ~(arg10 + arg11) && arg1 > arg0 + -13 && arg0 + 3 > arg1 && arg9.field8490) {
            arg2 = arg6;
         }

         ++field5685;
         int[] var12 = null;
         if (!class567.method4229(arg9.field8485, 125)) {
            if (~arg9.field8491 != 0) {
               var12 = class408.field5993.method845((byte)-101, arg9.field8491).field6326;
            } else if (class433.method3259(-18, arg9.field8485)) {
               class272 var13 = (class272)class78.field1344.method1572((long)((int)arg9.field8494), -16289);
               if (var13 != null) {
                  class451 var14 = var13.field3851;
                  class15 var15 = var14.field6586;
                  if (var15.field230 != null) {
                     var15 = var15.method111(class616.field8951, -2690);
                  }

                  if (var15 != null) {
                     var12 = var15.field229;
                  }
               }
            } else if (class237.method1942(1010, arg9.field8485)) {
               Object var16 = null;
               class670 var17;
               if (~arg9.field8485 != -1011) {
                  var17 = class634.field9256.method2559((int)(arg9.field8494 >>> 32 & 2147483647L), 0);
               } else {
                  var17 = class634.field9256.method2559((int)arg9.field8494, 0);
               }

               if (var17.field9805 != null) {
                  var17 = var17.method4894(0, class616.field8951);
               }

               if (var17 != null) {
                  var12 = var17.field9819;
               }
            }
         } else {
            var12 = class408.field5993.method845((byte)-35, (int)arg9.field8494).field6326;
         }

         String var18 = class729.method5266(arg9, -102);
         if (arg7 != -41) {
            field5686 = null;
         }

         if (var12 != null) {
            var18 = var18 + class502.method3767((byte)-84, var12);
         }

         class296.field4151.method710(0, class138.field2244, arg10 + 3, 0, class207.field3090, arg0, arg2, var18);
         if (arg9.field8479) {
            class601.field8679.method3609(class511.field7461.method3351(var18, true) + arg10 + 5, arg0 + -12);
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field5691[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5691[3] : field5691[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field5691[3] : field5691[4]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2104(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method2103(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IBI)V"
   )
   public abstract void method2108(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2994(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2995(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
