import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class429 {
   @OriginalMember(
      owner = "client!wl",
      name = "g",
      descriptor = "Leh;"
   )
   private class379 field6554;
   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "J"
   )
   public long field6555;
   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6556 = new String[]{method3272(method3271("\u000f9\u0006y+")), method3272(method3271("\u0003{\u0006\u0014~")), method3272(method3271("\u001abD;")), method3272(method3271("\u0003{\u00061?\u001avD>,\u0011?")), method3272(method3271("\u0003{\u0006\u0015~")), method3272(method3271("\u0003{\u0006k?\u001a~\\i~")), method3272(method3271("\u0003{\u0006\u0016~"))};
   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "I"
   )
   public static int field6549 = 13156520;
   @OriginalMember(
      owner = "client!wl",
      name = "h",
      descriptor = "I"
   )
   public static int field6550 = 1406;
   @OriginalMember(
      owner = "client!wl",
      name = "i",
      descriptor = "I"
   )
   public static int field6547;
   @OriginalMember(
      owner = "client!wl",
      name = "j",
      descriptor = "I"
   )
   public static int field6548;
   @OriginalMember(
      owner = "client!wl",
      name = "f",
      descriptor = "I"
   )
   public static int field6551;
   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "I"
   )
   public static int field6552;
   @OriginalMember(
      owner = "client!wl",
      name = "e",
      descriptor = "I"
   )
   public static int field6553;
   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class214 field6546;

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method3268(byte arg0) {
      try {
         field6546 = null;
         if (arg0 != 86) {
            field6548 = -76;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6556[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IIIII)V",
      line = 17
   )
   public static final void method3269(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field6547;
         if (arg1 > 59) {
            if (class197.field2442 <= arg3 - arg4 && ~class100.field1232 <= ~(arg3 - -arg4) && ~class506.field7472 >= ~(-arg4 + arg2) && class22.field234 >= arg2 + arg4) {
               class427.method3252((byte)-103, arg3, arg4, arg2, arg0);
            } else {
               class623.method4502(arg0, true, arg3, arg4, arg2);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6556[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(ILha;II)V",
      line = 35
   )
   public static final void method3270(int arg0, class66 arg1, int arg2, int arg3) {
      try {
         class459.field6944 = arg1;
         if (arg0 != 1) {
            field6549 = -100;
         }

         class208.field2653 = new class284[arg2][arg3];
         ++field6551;
         if (class188.field2346 != null) {
            class787.field11445 = class209.method1593(class188.field2346[2], class188.field2346[3], class188.field2346[5], (byte)-65, class188.field2346[0], class188.field2346[4], class188.field2346[1]);
         }

         class550.field8130 = new class284();
         class454.method3419(-2230);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6556[1] + arg0 + ',' + (arg1 != null ? field6556[0] : field6556[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "finalize",
      descriptor = "()V",
      line = 63
   )
   protected final void finalize() throws Throwable {
      try {
         this.field6554.method2932(-104, this.field6555);
         ++field6553;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6556[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "<init>",
      descriptor = "(Leh;JI)V",
      line = 74
   )
   public class429(class379 arg0, long arg1, int arg2) {
      try {
         this.field6554 = arg0;
         this.field6555 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6556[5] + (arg0 != null ? field6556[0] : field6556[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3271(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3272(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
