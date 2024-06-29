import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class403 extends class438 {
   @OriginalMember(
      owner = "client!oj",
      name = "u",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field5822;
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5828 = new String[]{method3043(method3042("M|\u0011UF")), method3043(method3042("M|\u0011-\u0007L\u007fK/F")), method3043(method3042("M|\u0011TF")), method3043(method3042("M|\u0011RF")), method3043(method3042("M|\u0011SF"))};
   @OriginalMember(
      owner = "client!oj",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field5821 = false;
   @OriginalMember(
      owner = "client!oj",
      name = "x",
      descriptor = "Leg;"
   )
   public static class118 field5820 = new class118(130, -1);
   @OriginalMember(
      owner = "client!oj",
      name = "v",
      descriptor = "I"
   )
   public static int field5827 = -1;
   @OriginalMember(
      owner = "client!oj",
      name = "w",
      descriptor = "I"
   )
   public static int field5823;
   @OriginalMember(
      owner = "client!oj",
      name = "q",
      descriptor = "I"
   )
   public static int field5824;
   @OriginalMember(
      owner = "client!oj",
      name = "s",
      descriptor = "I"
   )
   public static int field5825;
   @OriginalMember(
      owner = "client!oj",
      name = "t",
      descriptor = "I"
   )
   public static int field5826;

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(IZZ)Lth;"
   )
   public static final class623 method3038(int arg0, boolean arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         ++field5824;
         class762[] var4 = class237.field3305;
         synchronized(class237.field3305) {
            if (!arg2) {
               return null;
            } else {
               class623 var6;
               label71: {
                  if (~arg0 <= ~class237.field3305.length || class237.field3305[arg0].method5528(125)) {
                     var6 = new class623();
                     var6.field9164 = new class307[arg0];
                     int var7 = 0;
                     if (var3) {
                        var6.field9164[var7] = new class307();
                        ++var7;
                     }

                     while(true) {
                        while(arg0 > var7) {
                           var6.field9164[var7] = new class307();
                           ++var7;
                        }

                        if (!var3) {
                           if (!var3) {
                              break label71;
                           }
                           break;
                        }

                        ++var7;
                     }
                  }

                  var6 = (class623)class237.field3305[arg0].method5523((byte)21);
                  var6.method12((byte)-114);
                  int var10002 = class557.field7988[arg0]--;
               }

               var6.field9165 = arg1;
               return var6;
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field5828[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3039(int arg0) {
      try {
         if (arg0 >= 14) {
            ++field5823;
            this.field5822.method5097();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5828[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3040(byte arg0) {
      try {
         field5820 = null;
         if (arg0 <= 56) {
            method3038(32, false, false);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5828[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3041(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            method3038(-115, true, false);
         }

         ++field5826;
         return (class583.method4252(arg0, arg1, (byte)-115) | ~(arg0 & 8192) != -1 | class490.method3561(arg1, arg0, 90)) & class290.method2185(arg2 ^ 31695, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5828[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class403(int arg0) {
      try {
         this.field5822 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5828[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3042(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3043(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
