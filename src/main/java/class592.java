import jaclib.memory.Buffer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class592 extends class413 implements class280 {
   @OriginalMember(
      owner = "client!cv",
      name = "y",
      descriptor = "Lrfa;"
   )
   private class209 field8527;
   @OriginalMember(
      owner = "client!cv",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8536 = new String[]{method4373(method4372("8GC\u0019,")), method4373(method4372("8GC\u0016,")), method4373(method4372("8GC\u001e,")), method4373(method4372("8GC\u0015,")), method4373(method4372("8GC\u0017,")), method4373(method4372("8GC\u0013,")), method4373(method4372(" \u001fCvy")), method4373(method4372("5D\u00014")), method4373(method4372("8GCdm5X\u0019f,")), method4373(method4372("8GC\u0014,")), method4373(method4372("8GC\b,"))};
   @OriginalMember(
      owner = "client!cv",
      name = "w",
      descriptor = "I"
   )
   public static int field8534 = 0;
   @OriginalMember(
      owner = "client!cv",
      name = "C",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field8528 = new Hashtable();
   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "I"
   )
   public static int field8526;
   @OriginalMember(
      owner = "client!cv",
      name = "E",
      descriptor = "I"
   )
   public static int field8529;
   @OriginalMember(
      owner = "client!cv",
      name = "D",
      descriptor = "I"
   )
   public static int field8530;
   @OriginalMember(
      owner = "client!cv",
      name = "v",
      descriptor = "I"
   )
   public static int field8531;
   @OriginalMember(
      owner = "client!cv",
      name = "B",
      descriptor = "I"
   )
   public static int field8532;
   @OriginalMember(
      owner = "client!cv",
      name = "A",
      descriptor = "I"
   )
   public static int field8533;
   @OriginalMember(
      owner = "client!cv",
      name = "x",
      descriptor = "I"
   )
   public static int field8535;

   @OriginalMember(
      owner = "client!cv",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      try {
         if (arg0 != 29079) {
            this.method2190(-116);
         }

         ++field8535;
         super.method574(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8536[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(I)Lrfa;"
   )
   public final class209 method2191(int arg0) {
      try {
         ++field8526;
         int var2 = -94 / ((arg0 - -78) / 42);
         return this.field8527;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8536[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method570(int arg0) {
      try {
         if (arg0 != 1) {
            method4371((byte)116);
         }

         ++field8533;
         return super.method570(1);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8536[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2190(int arg0) {
      try {
         if (arg0 != -28008) {
            field8528 = null;
         }

         ++field8530;
         return super.method3152((byte)-127, super.field6048.field2072);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8536[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2189(int arg0, int arg1) {
      try {
         ++field8529;
         super.method2189(arg0, this.field8527.field3103 * arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8536[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method4370(int arg0) {
      boolean var1 = client.field4564;

      try {
         label41: {
            if (!class279.method2185(55, class376.field5588) && !class668.method4878(class376.field5588, 5047)) {
               int var2 = class304.field4398.field11313[0] >> 3;
               int var3 = class304.field4398.field11322[0] >> 3;
               if (~var2 > -1 || ~var2 <= ~(class209.field3112 >> 3) || var3 < 0 || ~(class1.field3 >> 3) >= ~var3) {
                  class780.method5644(class209.field3112 >> 4, 0, class1.field3 >> 4, (byte)-47);
                  if (!var1) {
                     break label41;
                  }
               }

               class780.method5644(var2, 5000, var3, (byte)-33);
               if (!var1) {
                  break label41;
               }
            }

            class780.method5644(class583.field8442 >> 12, 5000, class677.field9932 >> 12, (byte)-22);
         }

         ++field8532;
         class650.method4768(true);
         if (arg0 != 34963) {
            field8534 = 4;
         }

         class570.method4236((byte)-102);
         class323.method2516(-85);
         class348.method2686(arg0 ^ 44728);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8536[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(BZ)Ljaclib/memory/Buffer;"
   )
   public final Buffer method2188(byte arg0, boolean arg1) {
      try {
         if (arg0 != -46) {
            return null;
         } else {
            ++field8531;
            return super.method3151(super.field6048.field2072, (byte)-121, arg1);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8536[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "<init>",
      descriptor = "(Lbba;Lrfa;Z)V"
   )
   public class592(class124 arg0, class209 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field8527 = arg1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8536[8] + (arg0 != null ? field8536[6] : field8536[7]) + ',' + (arg1 != null ? field8536[6] : field8536[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4371(byte arg0) {
      try {
         if (arg0 >= -87) {
            method4370(-102);
         }

         field8528 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8536[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
