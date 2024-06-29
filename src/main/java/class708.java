import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class708 extends class539 {
   @OriginalMember(
      owner = "client!qo",
      name = "E",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10666;
   @OriginalMember(
      owner = "client!qo",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10667 = new String[]{method5222(method5221("=\u001akK\u001e")), method5222(method5221("=\u001akM\u001e")), method5222(method5221("\"\u0000)c")), method5222(method5221("7[k!K")), method5222(method5221("=\u001ak3_\"\u001c11\u001e")), method5222(method5221("=\u001akN\u001e"))};
   @OriginalMember(
      owner = "client!qo",
      name = "C",
      descriptor = "I"
   )
   public static int field10660 = 0;
   @OriginalMember(
      owner = "client!qo",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field10662 = new int[3];
   @OriginalMember(
      owner = "client!qo",
      name = "D",
      descriptor = "I"
   )
   public static int field10664 = 0;
   @OriginalMember(
      owner = "client!qo",
      name = "G",
      descriptor = "Lnaa;"
   )
   public static class113 field10663 = new class113(17, 4);
   @OriginalMember(
      owner = "client!qo",
      name = "A",
      descriptor = "I"
   )
   public static int field10661;
   @OriginalMember(
      owner = "client!qo",
      name = "B",
      descriptor = "I"
   )
   public static int field10665;

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "(Lic;Ljava/lang/Object;I)V"
   )
   public class708(class51 arg0, Object arg1, int arg2) {
      super(arg0, arg2);

      try {
         this.field10666 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10667[4] + (arg0 != null ? field10667[3] : field10667[2]) + ',' + (arg1 != null ? field10667[3] : field10667[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4124(byte arg0) {
      try {
         if (arg0 != 101) {
            this.method4124((byte)-1);
         }

         ++field10661;
         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10667[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "d",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method4123(byte arg0) {
      try {
         if (arg0 != 86) {
            return null;
         } else {
            ++field10665;
            return this.field10666;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10667[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method5220(byte arg0) {
      try {
         field10663 = null;
         field10662 = null;
         if (arg0 != 55) {
            field10664 = 113;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10667[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5222(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
