import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class555 {
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "Lfia;"
   )
   public class605 field7633;
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "I"
   )
   public int field7632;
   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7634 = new String[]{method4006(method4005("\nJ%\f\u0002")), method4006(method4005("\u0019\u0016%rW")), method4006(method4005("\fMg0")), method4006(method4005("\nJ%`C\fQ\u007fb\u0002")), method4006(method4005("MY6")), method4006(method4005("\nJ%\u0013\u0002")), method4006(method4005("\u0015O|q]\u0016Ij")), method4006(method4005("L[d1\u0005\u000e\u0005")), method4006(method4005("\u0015O|q]\u0016Jh")), method4006(method4005("\u0015O|")), method4006(method4005("MH6")), method4006(method4005("\nL\u007f,\u0010M\u0017")), method4006(method4005("\u0015O|q]\u0016Ob,")), method4006(method4005("\nJ%\r\u0002"))};
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "I"
   )
   public static int field7629;
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "I"
   )
   public static int field7630;
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "I"
   )
   public static int field7631;

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4002(int arg0, int arg1, int arg2) {
      try {
         if (arg0 > -97) {
            return true;
         } else {
            ++field7629;
            return (arg2 & 2048) != 0 | class774.method5545(-8, arg2, arg1) || class370.method2863(arg1, arg2, 99);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7634[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(B)Ljava/lang/String;"
   )
   public static final String method4003(byte arg0) {
      boolean var1 = client.field4273;

      try {
         String var2;
         label33: {
            ++field7631;
            var2 = field7634[9];
            if (class668.field9492 != class269.field3480) {
               if (class269.field3480 == class146.field1928) {
                  var2 = field7634[6];
                  if (!var1) {
                     break label33;
                  }
               }

               if (class603.field8404 != class269.field3480) {
                  break label33;
               }

               var2 = field7634[12];
               if (!var1) {
                  break label33;
               }
            }

            var2 = field7634[8];
         }

         if (arg0 != -3) {
            return null;
         } else {
            String var3 = "";
            if (class701.field10211 != null) {
               var3 = field7634[10] + class701.field10211;
            }

            return field7634[11] + var2 + "." + class381.field5334.field334 + field7634[7] + class494.field6787 + field7634[4] + class74.field924 + var3 + "/";
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7634[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4004(boolean arg0, int arg1) {
      try {
         if (this.method633(arg1, (byte)98) != 3) {
            this.method638(arg1, (byte)-126);
         }

         if (!arg0) {
            this.method638(3, (byte)28);
         }

         ++field7630;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7634[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method637(int arg0);

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(IB)I"
   )
   public abstract int method633(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "(IB)V"
   )
   public abstract void method638(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method635(int arg0);

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class555(class605 arg0) {
      try {
         this.field7633 = arg0;
         this.field7632 = this.method635(125);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7634[3] + (arg0 != null ? field7634[1] : field7634[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class555(int arg0, class605 arg1) {
      try {
         this.field7633 = arg1;
         this.field7632 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7634[3] + arg0 + ',' + (arg1 != null ? field7634[1] : field7634[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
