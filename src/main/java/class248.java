import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class248 {
   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "I"
   )
   public int field3769 = 128;
   @OriginalMember(
      owner = "client!ng",
      name = "d",
      descriptor = "I"
   )
   public int field3772 = 128;
   @OriginalMember(
      owner = "client!ng",
      name = "j",
      descriptor = "I"
   )
   public int field3774;
   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "I"
   )
   public int field3773;
   @OriginalMember(
      owner = "client!ng",
      name = "f",
      descriptor = "I"
   )
   public int field3777;
   @OriginalMember(
      owner = "client!ng",
      name = "e",
      descriptor = "I"
   )
   public int field3770;
   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3778 = new String[]{method2116(method2115(":v\u00027\u0018")), method2116(method2115(":v\u00026\u0018")), method2116(method2115(":v\u0002IY:xXK\u0018")), method2116(method2115("/?\u0002[M")), method2116(method2115(":v\u00024\u0018")), method2116(method2115(":d@\u0019")), method2116(method2115(":v\u00021\u0018"))};
   @OriginalMember(
      owner = "client!ng",
      name = "c",
      descriptor = "I"
   )
   public static int field3768;
   @OriginalMember(
      owner = "client!ng",
      name = "i",
      descriptor = "I"
   )
   public static int field3771;
   @OriginalMember(
      owner = "client!ng",
      name = "h",
      descriptor = "I"
   )
   public static int field3775;
   @OriginalMember(
      owner = "client!ng",
      name = "g",
      descriptor = "I"
   )
   public static int field3776;

   @OriginalMember(
      owner = "client!ng",
      name = "b",
      descriptor = "(I)Lng;",
      line = 9
   )
   public final class248 method2111(int arg0) {
      try {
         if (arg0 != 2) {
            return null;
         } else {
            ++field3776;
            return new class248(this.field3774, this.field3769, this.field3772, this.field3770, this.field3777, this.field3773);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3778[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "(I)V",
      line = 145
   )
   public class248(int arg0) {
      try {
         this.field3774 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3778[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 152
   )
   private class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field3769 = arg1;
         this.field3773 = arg5;
         this.field3777 = arg4;
         this.field3774 = arg0;
         this.field3770 = arg3;
         this.field3772 = arg2;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3778[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Lng;I)V",
      line = 28
   )
   public final void method2112(class248 arg0, int arg1) {
      try {
         this.field3774 = arg0.field3774;
         this.field3773 = arg0.field3773;
         int var3 = 17 % ((arg1 - -12) / 56);
         this.field3772 = arg0.field3772;
         this.field3769 = arg0.field3769;
         this.field3770 = arg0.field3770;
         ++field3775;
         this.field3777 = arg0.field3777;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3778[6] + (arg0 != null ? field3778[3] : field3778[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(I)V",
      line = 45
   )
   public static final void method2113(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ng",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      line = 68
   )
   public static final String method2114(String param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ng",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
