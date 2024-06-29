import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class453 {
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6945 = new String[]{method3555(method3554("uX%&#")), method3555(method3554("uX%%#"))};
   @OriginalMember(
      owner = "client!wt",
      name = "q",
      descriptor = "Lhf;"
   )
   public static class588 field6943 = new class588();
   @OriginalMember(
      owner = "client!wt",
      name = "u",
      descriptor = "Lnaa;"
   )
   public static class113 field6944 = new class113(83, 7);
   @OriginalMember(
      owner = "client!wt",
      name = "m",
      descriptor = "B"
   )
   public byte field6923;
   @OriginalMember(
      owner = "client!wt",
      name = "r",
      descriptor = "B"
   )
   public byte field6924;
   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "B"
   )
   public byte field6926;
   @OriginalMember(
      owner = "client!wt",
      name = "t",
      descriptor = "B"
   )
   public byte field6930;
   @OriginalMember(
      owner = "client!wt",
      name = "o",
      descriptor = "B"
   )
   public byte field6932;
   @OriginalMember(
      owner = "client!wt",
      name = "s",
      descriptor = "B"
   )
   public byte field6935;
   @OriginalMember(
      owner = "client!wt",
      name = "f",
      descriptor = "B"
   )
   public byte field6936;
   @OriginalMember(
      owner = "client!wt",
      name = "k",
      descriptor = "I"
   )
   public int field6925;
   @OriginalMember(
      owner = "client!wt",
      name = "d",
      descriptor = "I"
   )
   public int field6927;
   @OriginalMember(
      owner = "client!wt",
      name = "n",
      descriptor = "I"
   )
   public static int field6929;
   @OriginalMember(
      owner = "client!wt",
      name = "l",
      descriptor = "I"
   )
   public int field6931;
   @OriginalMember(
      owner = "client!wt",
      name = "e",
      descriptor = "I"
   )
   public static int field6941;
   @OriginalMember(
      owner = "client!wt",
      name = "h",
      descriptor = "S"
   )
   public short field6922;
   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "Z"
   )
   public boolean field6928;
   @OriginalMember(
      owner = "client!wt",
      name = "g",
      descriptor = "Z"
   )
   public boolean field6933;
   @OriginalMember(
      owner = "client!wt",
      name = "v",
      descriptor = "Z"
   )
   public boolean field6934;
   @OriginalMember(
      owner = "client!wt",
      name = "p",
      descriptor = "Z"
   )
   public boolean field6937;
   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6938;
   @OriginalMember(
      owner = "client!wt",
      name = "j",
      descriptor = "Z"
   )
   public boolean field6939;
   @OriginalMember(
      owner = "client!wt",
      name = "w",
      descriptor = "Z"
   )
   public boolean field6940;
   @OriginalMember(
      owner = "client!wt",
      name = "i",
      descriptor = "Z"
   )
   public boolean field6942;

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(I)V",
      line = 11
   )
   public static void method3551(int arg0) {
      try {
         field6944 = null;
         if (arg0 <= 110) {
            method3551(-13);
         }

         field6943 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6945[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public static final void method3552(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(Lr;III[Z)Z",
      line = 52
   )
   public static final boolean method3553(class273 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var5 = false;
      if (class385.field6076 != class190.field2949) {
         int var6 = class96.field1355[arg1].method2312(arg2, arg3, 66);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            class271 var8 = class96.field1355[var7];
            if (var8 != null) {
               int var9 = var6 - var8.method2312(arg2, arg3, 60);
               if (arg4 != null) {
                  arg4[var7] = var8.method1117(arg0, arg2, var9, arg3, 0, false);
                  if (!arg4[var7]) {
                     continue;
                  }
               }

               var8.method1133(arg0, arg2, var9, arg3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3554(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3555(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
