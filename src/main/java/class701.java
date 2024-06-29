import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class701 {
   @OriginalMember(
      owner = "client!uf",
      name = "i",
      descriptor = "I"
   )
   private int field10447;
   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10455 = new String[]{method5165(method5164("\f\u0007uI\u001a\u0017\b/K[")), method5165(method5164("\u0002Ou[\u000e")), method5165(method5164("\u0017\u00147\u0019")), method5165(method5164("\f\u0007u7[")), method5165(method5164("\f\u0007u1[")), method5165(method5164("\f\u0007u4[")), method5165(method5164("\f\u0007u6["))};
   @OriginalMember(
      owner = "client!uf",
      name = "j",
      descriptor = "I"
   )
   public static int field10451 = 0;
   @OriginalMember(
      owner = "client!uf",
      name = "d",
      descriptor = "Lnaa;"
   )
   public static class113 field10448 = new class113(45, 4);
   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field10452 = new class498(86, 11);
   @OriginalMember(
      owner = "client!uf",
      name = "e",
      descriptor = "Lnaa;"
   )
   public static class113 field10453 = new class113(22, 3);
   @OriginalMember(
      owner = "client!uf",
      name = "g",
      descriptor = "I"
   )
   public static int field10444;
   @OriginalMember(
      owner = "client!uf",
      name = "k",
      descriptor = "I"
   )
   public static int field10445;
   @OriginalMember(
      owner = "client!uf",
      name = "f",
      descriptor = "I"
   )
   public static int field10446;
   @OriginalMember(
      owner = "client!uf",
      name = "c",
      descriptor = "I"
   )
   public static int field10449;
   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "I"
   )
   public static int field10450;
   @OriginalMember(
      owner = "client!uf",
      name = "h",
      descriptor = "[Z"
   )
   public static boolean[] field10454;

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(BC)V",
      line = 6
   )
   public final void method5160(byte arg0, char arg1) {
      try {
         if (arg0 != -76) {
            field10446 = 111;
         }

         ++field10444;
         OpenGL.glCallList(this.field10447 - -arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10455[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "b",
      descriptor = "(I)V",
      line = 19
   )
   public static void method5161(int arg0) {
      try {
         int var1 = -43 / ((arg0 - -44) / 37);
         field10453 = null;
         field10454 = null;
         field10448 = null;
         field10452 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10455[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(II)V",
      line = 34
   )
   public final void method5162(int arg0, int arg1) {
      try {
         ++field10449;
         OpenGL.glNewList(this.field10447 + arg0, 4864);
         if (arg1 != -6177) {
            method5161(52);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10455[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "<init>",
      descriptor = "(Lc;I)V",
      line = 45
   )
   public class701(class652 arg0, int arg1) {
      try {
         this.field10447 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10455[0] + (arg0 != null ? field10455[1] : field10455[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "a",
      descriptor = "(I)V",
      line = 59
   )
   public final void method5163(int arg0) {
      try {
         if (arg0 == -3623) {
            OpenGL.glEndList();
            ++field10445;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10455[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5164(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5165(char[] arg0) {
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
            var10005 = 97;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
