import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class367 {
   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5458 = new String[]{method2870(method2869("\u0018lu{^")), method2870(method2869("\u0018lu\u007f^")), method2870(method2869("\u0017r7V")), method2870(method2869("\u0002)u\u0014\u000b")), method2870(method2869("\u0018lu~^")), method2870(method2869("\u0018lux^")), method2870(method2869("\u0018luy^"))};
   @OriginalMember(
      owner = "client!ak",
      name = "i",
      descriptor = "I"
   )
   public int field5449;
   @OriginalMember(
      owner = "client!ak",
      name = "d",
      descriptor = "I"
   )
   public static int field5450;
   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "I"
   )
   public static int field5451;
   @OriginalMember(
      owner = "client!ak",
      name = "e",
      descriptor = "I"
   )
   public static int field5452;
   @OriginalMember(
      owner = "client!ak",
      name = "g",
      descriptor = "I"
   )
   public static int field5454;
   @OriginalMember(
      owner = "client!ak",
      name = "h",
      descriptor = "I"
   )
   public static int field5455;
   @OriginalMember(
      owner = "client!ak",
      name = "f",
      descriptor = "I"
   )
   public int field5457;
   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "[Ltl;"
   )
   public class644[] field5453;
   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "[[S"
   )
   public static short[][] field5456;

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(ILuda;Lqg;)Ltl;"
   )
   private final class644 method2864(int arg0, class473 arg1, class485 arg2) {
      try {
         ++field5451;
         if (class443.field6458 == arg2) {
            return class290.method2249((byte)-68, arg1);
         } else if (class604.field8697 == arg2) {
            return class339.method2619(-2, arg1);
         } else if (class289.field4044 == arg2) {
            return class314.method2435(1, arg1);
         } else if (class601.field8675 == arg2) {
            return class45.method563((byte)28, arg1);
         } else if (class431.field6249 == arg2) {
            return class449.method3384(arg1, 78);
         } else if (class722.field10450 == arg2) {
            return class462.method3463(arg0 + 32206, arg1);
         } else if (class471.field6841 == arg2) {
            return class650.method4770(1995480456, arg1);
         } else if (class318.field4600 == arg2) {
            return class438.method3284(arg1, 124);
         } else {
            if (arg0 != -31950) {
               method2868(true, 79, 13);
            }

            if (class313.field4510 == arg2) {
               return class421.method3198(arg1, arg0 ^ 31949);
            } else {
               return class477.field6955 == arg2 ? class328.method2540(arg0 ^ -31947, arg1) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5458[4] + arg0 + ',' + (arg1 != null ? field5458[3] : field5458[2]) + ',' + (arg2 != null ? field5458[3] : field5458[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2865(byte arg0) {
      try {
         field5456 = null;
         int var1 = 76 % ((-79 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5458[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   public final void method2866(class473 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         ++field5452;
         this.field5449 = arg0.method3577(-2);
         this.field5457 = arg0.method3565(true);
         this.field5453 = new class644[arg0.method3564((byte)-77)];
         class485[] var4 = class31.method229(-24);
         int var5 = 0;
         if (var3) {
            this.field5453[var5] = this.method2864(-31950, arg0, var4[arg0.method3564((byte)-51)]);
            ++var5;
         }

         while(true) {
            while(var5 < this.field5453.length) {
               this.field5453[var5] = this.method2864(-31950, arg0, var4[arg0.method3564((byte)-51)]);
               ++var5;
            }

            if (!var3) {
               if (arg1 > -95) {
                  method2867(23, (class268)null);
                  return;
               }

               return;
            }

            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5458[5] + (arg0 != null ? field5458[3] : field5458[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(ILpd;)Z"
   )
   public static final boolean method2867(int arg0, class268 arg1) {
      try {
         ++field5454;
         class670 var2 = class634.field9256.method2559(arg1.method591((byte)-125), 0);
         if (var2.field9810 == -1) {
            return true;
         } else if (arg0 < 66) {
            return true;
         } else {
            class780 var3 = class126.field2114.method5056(var2.field9810, 104);
            return var3.field11432 == -1 ? true : var3.method5641(6406);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5458[6] + arg0 + ',' + (arg1 != null ? field5458[3] : field5458[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method2868(boolean arg0, int arg1, int arg2) {
      try {
         ++field5455;
         class536 var3 = class108.method1038(0L, 109, 15);
         if (arg0) {
            field5456 = null;
         }

         var3.method4017(24076);
         var3.field7798 = arg2;
         var3.field7800 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5458[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2869(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2870(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
