import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class639 extends class546 {
   @OriginalMember(
      owner = "client!pe",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9017 = new String[]{method4633(method4632("\u007fCEP\u001b")), method4633(method4632("t\bE<N")), method4633(method4632("j\u0018\u0007\u0012")), method4633(method4632("t\bE?N")), method4633(method4632("t\bE:N")), method4633(method4632("t\bE=N")), method4633(method4632("t\bE;N")), method4633(method4632("t\bE8N"))};
   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "Ljh;"
   )
   public static class169 field9013 = new class169();
   @OriginalMember(
      owner = "client!pe",
      name = "y",
      descriptor = "I"
   )
   public static int field9015 = -1;
   @OriginalMember(
      owner = "client!pe",
      name = "B",
      descriptor = "I"
   )
   public static int field9007;
   @OriginalMember(
      owner = "client!pe",
      name = "v",
      descriptor = "I"
   )
   public static int field9008;
   @OriginalMember(
      owner = "client!pe",
      name = "A",
      descriptor = "I"
   )
   public static int field9009;
   @OriginalMember(
      owner = "client!pe",
      name = "t",
      descriptor = "I"
   )
   public static int field9011;
   @OriginalMember(
      owner = "client!pe",
      name = "C",
      descriptor = "I"
   )
   public static int field9012;
   @OriginalMember(
      owner = "client!pe",
      name = "w",
      descriptor = "Ldia;"
   )
   private class245 field9010;
   @OriginalMember(
      owner = "client!pe",
      name = "u",
      descriptor = "Lqh;"
   )
   public static class74 field9016;
   @OriginalMember(
      owner = "client!pe",
      name = "x",
      descriptor = "Lbo;"
   )
   public static class763 field9014;

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   public final void method4626(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9008;
         if (arg0 < 78) {
            this.method4628(26, -19, false);
         }

         do {
            int var4 = arg1.method4288((byte)89);
            if (var4 == 0) {
               break;
            }

            this.method4630(arg1, (byte)-75, var4);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9017[1] + arg0 + ',' + (arg1 != null ? field9017[0] : field9017[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4627(int arg0) {
      try {
         field9013 = null;
         if (arg0 <= 115) {
            field9014 = null;
         }

         field9014 = null;
         field9016 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9017[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public final int method4628(int arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            this.method4628(31, 29, true);
         }

         ++field9009;
         if (this.field9010 == null) {
            return arg1;
         } else {
            class144 var4 = (class144)this.field9010.method1839(-113, (long)arg0);
            return var4 == null ? arg1 : var4.field1905;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9017[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4629(int arg0) {
      try {
         if (arg0 <= -115) {
            class545.field7442 = 0;
            class369.field5190 = -2;
            class654.field9151 = -2;
            ++field9007;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9017[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(Lwm;BI)V"
   )
   private final void method4630(class594 param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;"
   )
   public final String method4631(String arg0, int arg1, byte arg2) {
      try {
         ++field9011;
         if (this.field9010 == null) {
            return arg0;
         } else if (arg2 != 115) {
            return null;
         } else {
            class154 var4 = (class154)this.field9010.method1839(-114, (long)arg1);
            return var4 == null ? arg0 : var4.field1990;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9017[7] + (arg0 != null ? field9017[0] : field9017[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4632(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4633(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
