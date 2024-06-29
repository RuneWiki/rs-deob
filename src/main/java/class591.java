import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class591 {
   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "I"
   )
   public int field8524;
   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8525 = new String[]{method4369(method4368("cn\u0018\u0001\\")), method4369(method4368("cn\u0018~\u001d|nB|\\")), method4369(method4368("cn\u0018\u0000\\")), method4369(method4368("cn\u0018\u0003\\")), method4369(method4368("cn\u00186\u001bAsD+\u001au/"))};
   @OriginalMember(
      owner = "client!qi",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field8520 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!qi",
      name = "d",
      descriptor = "I"
   )
   public static int field8519;
   @OriginalMember(
      owner = "client!qi",
      name = "f",
      descriptor = "I"
   )
   public static int field8521;
   @OriginalMember(
      owner = "client!qi",
      name = "e",
      descriptor = "I"
   )
   public static int field8522;
   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "I"
   )
   public static int field8523;

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4365(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(ZZ)I"
   )
   public static final int method4366(boolean arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         ++field8521;
         if (class621.field9057 == null) {
            return 0;
         } else if (!arg0 && class262.field3722 != null) {
            return class621.field9057.length * 2;
         } else {
            int var3 = 0;
            int var4 = 0;
            int var5;
            if (var2) {
               var5 = class621.field9057[var4];
               if (class360.field5393.method1335((byte)115, var5)) {
                  ++var3;
               }

               if (class696.field10200.method1335((byte)115, var5)) {
                  ++var3;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~var4 <= ~class621.field9057.length) {
                  var10000 = arg1;
                  if (!var2) {
                     if (arg1 != 0) {
                        field8522 = -104;
                     }

                     return var3;
                  }
               } else {
                  var10000 = class621.field9057[var4];
               }

               var5 = var10000;
               if (class360.field5393.method1335((byte)115, var5)) {
                  ++var3;
               }

               if (class696.field10200.method1335((byte)115, var5)) {
                  ++var3;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8525[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4367(int arg0) {
      try {
         field8520 = null;
         if (arg0 != 8) {
            field8522 = 58;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8525[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8519;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8525[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class591(int arg0) {
      try {
         this.field8524 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8525[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4368(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4369(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
