import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class588 extends class500 {
   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8108 = new String[]{method4227(method4226("}\u0002\\Sf")), method4227(method4226("}\u0002\\Qf")), method4227(method4226("}\u0002\\Pf"))};
   @OriginalMember(
      owner = "client!po",
      name = "m",
      descriptor = "Ltv;"
   )
   public static class590 field8104 = new class590(32);
   @OriginalMember(
      owner = "client!po",
      name = "j",
      descriptor = "I"
   )
   public static int field8103;
   @OriginalMember(
      owner = "client!po",
      name = "l",
      descriptor = "I"
   )
   public static int field8105;
   @OriginalMember(
      owner = "client!po",
      name = "n",
      descriptor = "I"
   )
   public int field8106;
   @OriginalMember(
      owner = "client!po",
      name = "k",
      descriptor = "I"
   )
   public int field8107;

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method4223(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         class481.method3503();
         ++field8103;
         int var2 = 0;
         if (var1) {
            class331.field4738[var2].method1158((byte)-126);
            ++var2;
         }

         while(true) {
            while(var2 < 4) {
               class331.field4738[var2].method1158((byte)-126);
               ++var2;
            }

            if (!var1) {
               if (!arg0) {
                  method4224(-93);
               }

               class217.method1653(-1);
               class749.method5415(arg0);
               class29.method241((byte)124);
               System.gc();
               class338.field4832.method608();
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8108[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4224(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4225(int arg0) {
      try {
         if (arg0 != -17285) {
            method4223(true);
         }

         field8104 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8108[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4226(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4227(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
