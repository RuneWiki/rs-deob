import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class442 extends class70 {
   @OriginalMember(
      owner = "client!wn",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6801 = new String[]{method3485(method3484("Qf#>\u0002")), method3485(method3484("Qf#9\u0002")), method3485(method3484("Qf#<\u0002")), method3485(method3484("Qf#8\u0002"))};
   @OriginalMember(
      owner = "client!wn",
      name = "J",
      descriptor = "Lnaa;"
   )
   public static class113 field6796 = new class113(72, 0);
   @OriginalMember(
      owner = "client!wn",
      name = "G",
      descriptor = "Lsg;"
   )
   public static class742 field6799 = new class742();
   @OriginalMember(
      owner = "client!wn",
      name = "I",
      descriptor = "I"
   )
   public static int field6797;
   @OriginalMember(
      owner = "client!wn",
      name = "F",
      descriptor = "I"
   )
   public static int field6798;
   @OriginalMember(
      owner = "client!wn",
      name = "H",
      descriptor = "I"
   )
   public static int field6800;

   @OriginalMember(
      owner = "client!wn",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method3481(int arg0) {
      try {
         class450.field6888.method688(class640.field9279);
         ++field6798;
         if (arg0 != 72) {
            method3481(105);
         }

         class450.field6888.method639(class650.field9376, class27.field328, class724.field10832, class541.field8160);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6801[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "()V"
   )
   public class442() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(BZ)I"
   )
   public static final int method3482(byte arg0, boolean arg1) {
      try {
         ++field6800;
         if (arg0 <= 36) {
            method3482((byte)-62, true);
         }

         int var2 = class67.field883;
         if (~var2 != -1) {
            if (~var2 == -2) {
               return class656.field9793;
            }

            if (var2 != 2) {
               return 0;
            }

            if (!client.field1786) {
               return 0;
            }
         }

         return !arg1 ? class656.field9793 : 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6801[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method3483(int arg0) {
      try {
         if (arg0 > 0) {
            field6796 = null;
         }

         field6796 = null;
         field6799 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6801[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      try {
         ++field6797;
         if (arg0 != 87) {
            return null;
         } else {
            int[] var3 = super.field923.method3718(-2, arg1);
            if (super.field923.field7284) {
               class107.method1025(var3, 0, class678.field10127, class204.field3113[arg1]);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6801[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
