import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public abstract class class47 extends class247 {
   @OriginalMember(
      owner = "client!cha",
      name = "l",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field723;
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field728 = new String[]{method530(method529("\u0013\u00150S")), method530(method529("\u001e\b=\u0011KU")), method530(method529("\u0006Nr\u0011|")), method530(method529("\u001e\b=\u0011JU")), method530(method529("\u001e\b=\u0011MU")), method530(method529("\u001e\b=\u0011=\u0014\u000e5K?U"))};
   @OriginalMember(
      owner = "client!cha",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field725 = new int[13];
   @OriginalMember(
      owner = "client!cha",
      name = "m",
      descriptor = "I"
   )
   public static int field724;
   @OriginalMember(
      owner = "client!cha",
      name = "j",
      descriptor = "I"
   )
   public static int field726;
   @OriginalMember(
      owner = "client!cha",
      name = "n",
      descriptor = "I"
   )
   public int field727;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(ZLjagtheora/ogg/OggPacket;)V"
   )
   public final void method526(boolean arg0, OggPacket arg1) {
      try {
         ++field724;
         this.method468(-13313, arg1);
         if (!arg0) {
            this.field723 = null;
         }

         ++this.field727;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field728[1] + arg0 + ',' + (arg1 != null ? field728[2] : field728[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method527(byte arg0) {
      try {
         field725 = null;
         if (arg0 != 110) {
            field725 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field728[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public abstract void method468(int arg0, OggPacket arg1);

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method471(int arg0);

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(IIIIIIBI)V"
   )
   public static final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         ++field726;
         class523 var9 = null;
         class523 var10 = (class523)class637.field9006.method2245((byte)-94);
         if (var8 || var10 != null) {
            do {
               if (var10.field7397 == arg2 && var10.field7398 == arg0 && var10.field7399 == arg7 && var10.field7401 == arg4) {
                  var9 = var10;
                  break;
               }

               var10 = (class523)class637.field9006.method2239((byte)95);
            } while(var10 != null);
         }

         while(var8) {
         }

         if (var9 == null) {
            var9 = new class523();
            var9.field7398 = arg0;
            var9.field7399 = arg7;
            var9.field7401 = arg4;
            var9.field7397 = arg2;
            if (~arg0 <= -1 && ~arg7 <= -1 && ~class234.field3626 < ~arg0 && arg7 < class209.field2989) {
               class587.method4308((byte)30, var9);
            }

            class637.field9006.method2238(var9, 13);
         }

         var9.field7403 = arg3;
         var9.field7400 = arg1;
         var9.field7394 = arg5;
         var9.field7405 = false;
         var9.field7402 = true;
         if (arg6 != 10) {
            field725 = null;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field728[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class47(OggStreamState arg0) {
      try {
         this.field723 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field728[5] + (arg0 != null ? field728[2] : field728[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
