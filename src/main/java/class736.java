import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class736 implements Runnable {
   @OriginalMember(
      owner = "client!gj",
      name = "D",
      descriptor = "Lit;"
   )
   private class769 field10736 = null;
   @OriginalMember(
      owner = "client!gj",
      name = "E",
      descriptor = "Z"
   )
   private boolean field10739 = false;
   @OriginalMember(
      owner = "client!gj",
      name = "B",
      descriptor = "Lqp;"
   )
   public class492 field10748 = null;
   @OriginalMember(
      owner = "client!gj",
      name = "A",
      descriptor = "Lqp;"
   )
   public class492 field10740 = null;
   @OriginalMember(
      owner = "client!gj",
      name = "p",
      descriptor = "Lqp;"
   )
   public class492 field10746 = null;
   @OriginalMember(
      owner = "client!gj",
      name = "q",
      descriptor = "Lit;"
   )
   private class769 field10733 = null;
   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "Z"
   )
   public boolean field10745 = false;
   @OriginalMember(
      owner = "client!gj",
      name = "u",
      descriptor = "Z"
   )
   public boolean field10749 = false;
   @OriginalMember(
      owner = "client!gj",
      name = "v",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field10755;
   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "[Lqp;"
   )
   public class492[] field10737;
   @OriginalMember(
      owner = "client!gj",
      name = "d",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10752;
   @OriginalMember(
      owner = "client!gj",
      name = "e",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10738;
   @OriginalMember(
      owner = "client!gj",
      name = "y",
      descriptor = "Lla;"
   )
   private class443 field10742;
   @OriginalMember(
      owner = "client!gj",
      name = "k",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field10743;
   @OriginalMember(
      owner = "client!gj",
      name = "F",
      descriptor = "Lfs;"
   )
   private class610 field10741;
   @OriginalMember(
      owner = "client!gj",
      name = "s",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10754;
   @OriginalMember(
      owner = "client!gj",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10764 = new String[]{method5347(method5346(".\u001e")), method5347(method5346("-\u0012}\t2=\u0002z\u001b/?\u0001l=.?\u001bB*$-2g.?2\u0012m")), method5347(method5346(" X")), method5347(method5346("oY8")), method5347(method5346(",\u0016g+23Ym.)")), method5347(method5346("3\u0016`!\u00028\u001ee*\u0002=\u0016j'8p\u001em7")), method5347(method5346("3\u001ej=2-\u0018o;")), method5347(method5346("\u000b\u0019b!2)\u0019")), method5347(method5346("+\u0004l=s6\u0018d*")), method5347(method5346(",\u0000")), method5347(method5346("4\u0016\u007f.s(\u0012g+2,")), method5347(method5346("4\u0016\u007f.s?\u0000}a\u001e1\u0019}.40\u0012{")), method5347(method5346("3\u0016`!\u00028\u001ee*\u0002=\u0016j'8p\u0013h;o")), method5347(method5346("-\u0012}\t2=\u0002z\f$=\u001bl\u001d21\u0003")), method5347(method5346("4\u0016\u007f.s?\u0000}a\u001e1\u001ay 3;\u0019}")), method5347(method5346("9\u0011h")), method5347(method5346("1\u0004'./=\u001f")), method5347(method5346("3\u0016`!\u00028\u001ee*\u0002=\u0016j'8p\u001em7okB")), method5347(method5346("*\u001b")), method5347(method5346("\u001f ]")), method5347(method5346("1\u0004'!<3\u0012")), method5347(method5346("1\u0004'98,\u0004` 3")), method5347(method5346("4\u0016\u007f.s(\u0012{<41\u0019")), method5347(method5346("6\u0003}?.dX&")), method5347(method5346("4\u0016\u007f.s?\u0000}a\r1\u001eg;")), method5347(method5346("?\u0015j+88\u0010a&75\u001bd!2.\u0006{<)+\u0001~7$$6K\f\u0019\u001b1N\u0007\u0014\u0014<E\u0002\u0013\u0011'X\u001d\u000e\n\"_\u0018\u0005\u0007-9~omC<yjfN6i`rY,dp\u0001T3`w")), method5347(method5346("3\u0018\u007f*01\u0002z*")), method5347(method5346("-\u0012},(-\u0003f\">+\u0005z /")), method5347(method5346("\u0014\u0016n*%~1|#1~$j=8;\u0019")), method5347(method5346("\u0005>")), method5347(method5346("=\u001amor=Wz;<,\u0003)m7|W+")), method5347(method5346("4\u0016\u007f.s?\u0000}a\u001b,\u0016d*")), method5347(method5346(")\u001eg")), method5347(method5346("2\u001ez;01\u0013l<")), method5347(method5346("6\u0003}?gqX")), method5347(method5346("-\u001ff8>+\u0005z /")), method5347(method5346(";\u0019}*/")), method5347(method5346(";\u000f`;")), method5347(method5346("p\u0013h;")), method5347(method5346("=M&")), method5347(method5346("=M&840\u0013f8.q")), method5347(method5346("4\u0016n*%\u0001")), method5347(method5346("\u0001\u0000`?s:\u0016}")), method5347(method5346("q\u0003d?r")), method5347(method5346("\u0001\u0007{*;;\u0005l!>;\u0004")), method5347(method5346("=M&=.=\u0016j'8q")), method5347(method5346("q\u0005z,<=\u001fl`")), method5347(method5346("=M&840\u0019}`")), method5347(method5346("\u0001\u0005ja9?\u0003"))};
   @OriginalMember(
      owner = "client!gj",
      name = "i",
      descriptor = "J"
   )
   private static volatile long field10753 = 0L;
   @OriginalMember(
      owner = "client!gj",
      name = "n",
      descriptor = "I"
   )
   private static int field10735;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gj",
      name = "o",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10760;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gj",
      name = "l",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10761;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gj",
      name = "w",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10762;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10763;
   @OriginalMember(
      owner = "client!gj",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10732;
   @OriginalMember(
      owner = "client!gj",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10734;
   @OriginalMember(
      owner = "client!gj",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10750;
   @OriginalMember(
      owner = "client!gj",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10751;
   @OriginalMember(
      owner = "client!gj",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10756;
   @OriginalMember(
      owner = "client!gj",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10757;
   @OriginalMember(
      owner = "client!gj",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10758;
   @OriginalMember(
      owner = "client!gj",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private static String field10759;
   @OriginalMember(
      owner = "client!gj",
      name = "c",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field10744;
   @OriginalMember(
      owner = "client!gj",
      name = "j",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field10747;

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)Lit;"
   )
   public final class769 method5325(int arg0, Frame arg1) {
      int var3 = 46 % ((arg0 - -69) / 36);
      return this.method5331(0, arg1, 7, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "(ILjava/lang/String;)Lit;"
   )
   public final class769 method5326(int arg0, String arg1) {
      return arg0 != 0 ? null : this.method5331(0, arg1, 16, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(true) {
         class769 var2;
         synchronized(this) {
            while(true) {
               if (this.field10739) {
                  return;
               }

               if (this.field10736 != null) {
                  var2 = this.field10736;
                  this.field10736 = this.field10736.field11216;
                  if (this.field10736 == null) {
                     this.field10733 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var30) {
               }
            }
         }

         try {
            int var3 = var2.field11213;
            if (var3 == 1) {
               if (class163.method1353(-128) < field10753) {
                  throw new IOException();
               }

               var2.field11212 = new Socket(InetAddress.getByName((String)var2.field11215), var2.field11211);
            } else if (~var3 == -23) {
               if (class163.method1353(-124) < field10753) {
                  throw new IOException();
               }

               try {
                  var2.field11212 = class630.method4654((byte)35, (String)var2.field11215, var2.field11211).method3794(true);
               } catch (class381 var29) {
                  var2.field11212 = var29.getMessage();
                  throw var29;
               }
            } else if (var3 == 2) {
               Thread var23 = new Thread((Runnable)var2.field11215);
               var23.setDaemon(true);
               var23.start();
               var23.setPriority(var2.field11211);
               var2.field11212 = var23;
            } else if (~var3 != -5) {
               if (~var3 == -9) {
                  Object[] var5 = (Object[])var2.field11215;
                  if (this.field10745 && ((Class)var5[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field11212 = ((Class)var5[0]).getDeclaredMethod((String)var5[1], (Class[])var5[2]);
               } else if (~var3 == -10) {
                  Object[] var6 = (Object[])var2.field11215;
                  if (this.field10745 && ((Class)var6[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field11212 = ((Class)var6[0]).getDeclaredField((String)var6[1]);
               } else if (~var3 == -19) {
                  Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var2.field11212 = var22.getContents((Object)null);
               } else if (~var3 == -20) {
                  Transferable var7 = (Transferable)var2.field11215;
                  Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                  var8.setContents(var7, (ClipboardOwner)null);
               } else {
                  if (!this.field10745) {
                     throw new Exception("");
                  }

                  if (~var3 != -4) {
                     if (var3 == 21) {
                        if (~class163.method1353(-119) > ~field10753) {
                           throw new IOException();
                        }

                        var2.field11212 = InetAddress.getByName((String)var2.field11215).getAddress();
                     } else if (~var3 == -6) {
                        if (this.field10749) {
                           var2.field11212 = this.field10742.method3408(8);
                        } else {
                           var2.field11212 = Class.forName(field10764[0]).getMethod(field10764[33]).invoke(this.field10738);
                        }
                     } else if (var3 == 6) {
                        Frame var20 = new Frame(field10764[28]);
                        var2.field11212 = var20;
                        var20.setResizable(false);
                        if (!this.field10749) {
                           Class.forName(field10764[0]).getMethod(field10764[36], field10763 != null ? field10763 : (field10763 = method5345(field10764[31])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field10738, var20, new Integer(var2.field11211 >>> 16), new Integer(var2.field11211 & 65535), new Integer(var2.field11214 >> 16), new Integer(65535 & var2.field11214));
                        } else {
                           this.field10742.method3409(var2.field11214 & 65535, var2.field11214 >> 16, var2.field11211 >>> 16, 65535 & var2.field11211, var20, 0);
                        }
                     } else if (~var3 != -8) {
                        if (~var3 == -13) {
                           class492 var9 = method5341(field10759, field10735, 84, (String)var2.field11215);
                           var2.field11212 = var9;
                        } else if (var3 == 13) {
                           class492 var10 = method5341("", field10735, 110, (String)var2.field11215);
                           var2.field11212 = var10;
                        } else if (this.field10745 && ~var3 == -15) {
                           int var11 = var2.field11211;
                           int var12 = var2.field11214;
                           if (!this.field10749) {
                              Class.forName(field10764[15]).getDeclaredMethod(field10764[26], Integer.TYPE, Integer.TYPE).invoke(this.field10743, new Integer(var11), new Integer(var12));
                           } else {
                              this.field10741.method4505(var11, 101024, var12);
                           }
                        } else if (this.field10745 && var3 == 15) {
                           boolean var18 = var2.field11211 != 0;
                           Component var19 = (Component)var2.field11215;
                           if (!this.field10749) {
                              Class.forName(field10764[15]).getDeclaredMethod(field10764[35], field10760 != null ? field10760 : (field10760 = method5345(field10764[14])), Boolean.TYPE).invoke(this.field10743, var19, new Boolean(var18));
                           } else {
                              this.field10741.method4504(var18, (byte)-95, var19);
                           }
                        } else if (!this.field10749 && ~var3 == -18) {
                           Object[] var13 = (Object[])var2.field11215;
                           Class.forName(field10764[15]).getDeclaredMethod(field10764[27], field10760 != null ? field10760 : (field10760 = method5345(field10764[14])), field10761 != null ? field10761 : (field10761 = method5345(field10764[29])), Integer.TYPE, Integer.TYPE, field10762 != null ? field10762 : (field10762 = method5345(field10764[24]))).invoke(this.field10743, (Component)var13[0], (int[])var13[1], new Integer(var2.field11211), new Integer(var2.field11214), (Point)var13[2]);
                        } else {
                           if (var3 != 16) {
                              throw new Exception("");
                           }

                           try {
                              if (!field10758.startsWith(field10764[32])) {
                                 throw new Exception();
                              }

                              String var14 = (String)var2.field11215;
                              if (!var14.startsWith(field10764[34]) && !var14.startsWith(field10764[23])) {
                                 throw new Exception();
                              }

                              String var15 = field10764[25];

                              for(int var16 = 0; ~var14.length() < ~var16; ++var16) {
                                 if (~var15.indexOf(var14.charAt(var16)) == 0) {
                                    throw new Exception();
                                 }
                              }

                              Runtime.getRuntime().exec(field10764[30] + var14 + "\"");
                              var2.field11212 = null;
                           } catch (Exception var31) {
                              var2.field11212 = var31;
                              throw var31;
                           }
                        }
                     } else if (this.field10749) {
                        this.field10742.method3410((Frame)var2.field11215, 17);
                     } else {
                        Class.forName(field10764[0]).getMethod(field10764[37]).invoke(this.field10738);
                     }
                  } else {
                     if (~field10753 < ~class163.method1353(-120)) {
                        throw new IOException();
                     }

                     String var21 = (var2.field11211 >> 24 & 255) + "." + ((var2.field11211 & 16722374) >> 16) + "." + ((var2.field11211 & 65302) >> 8) + "." + (255 & var2.field11211);
                     var2.field11212 = InetAddress.getByName(var21).getHostName();
                  }
               }
            } else {
               if (field10753 > class163.method1353(-121)) {
                  throw new IOException();
               }

               var2.field11212 = new DataInputStream(((URL)var2.field11215).openStream());
            }

            var2.field11210 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field11210 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/lang/String;)Lqp;"
   )
   public static final class492 method5327(int arg0, String arg1) {
      if (arg0 != 0) {
         field10747 = null;
      }

      return method5341(field10759, field10735, arg0 ^ 107, arg1);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lit;"
   )
   public final class769 method5328(Class arg0, Class[] arg1, int arg2, String arg3) {
      if (arg2 != 15) {
         this.method5331(-68, (Object)null, 42, true, 6);
      }

      return this.method5331(0, new Object[]{arg0, arg3, arg1}, 8, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Lit;"
   )
   public final class769 method5329(String arg0, boolean arg1, Class arg2) {
      return !arg1 ? null : this.method5331(0, new Object[]{arg2, arg0}, 9, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "b",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method5330(int arg0) {
      if (arg0 < 62) {
         field10757 = null;
      }

      return this.field10752;
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/lang/Object;IZI)Lit;"
   )
   private final class769 method5331(int arg0, Object arg1, int arg2, boolean arg3, int arg4) {
      class769 var6 = new class769();
      var6.field11211 = arg4;
      var6.field11214 = arg0;
      var6.field11213 = arg2;
      if (arg3) {
         this.method5328((Class)null, (Class[])null, -27, (String)null);
      }

      var6.field11215 = arg1;
      synchronized(this) {
         if (this.field10733 != null) {
            this.field10733.field11216 = var6;
            this.field10733 = var6;
         } else {
            this.field10733 = this.field10736 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Ljava/lang/String;BZ)Lit;"
   )
   public final class769 method5332(String arg0, byte arg1, boolean arg2) {
      if (arg1 != -14) {
         this.field10738 = null;
      }

      return arg2 ? this.method5331(0, arg0, 12, false, 0) : this.method5331(0, arg0, 13, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/io/File;[B)Z"
   )
   public final boolean method5333(int arg0, File arg1, byte[] arg2) {
      try {
         if (arg0 <= 7) {
            this.method5344((byte)-16);
         }

         FileOutputStream var4 = new FileOutputStream(arg1);
         var4.write(arg2, 0, arg2.length);
         var4.close();
         return true;
      } catch (IOException var5) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/lang/String;BZ)Lit;"
   )
   public final class769 method5334(int arg0, String arg1, byte arg2, boolean arg3) {
      if (arg2 >= -71) {
         field10747 = null;
      }

      return this.method5331(0, arg1, arg3 ? 22 : 1, false, arg0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(ILjava/net/URL;)Lit;"
   )
   public final class769 method5335(int arg0, URL arg1) {
      if (arg0 != 0) {
         this.method5331(-94, (Object)null, -8, false, 106);
      }

      return this.method5331(0, arg1, 4, false, 0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(BI[IILjava/awt/Point;Ljava/awt/Component;)Lit;"
   )
   public final class769 method5336(byte arg0, int arg1, int[] arg2, int arg3, Point arg4, Component arg5) {
      if (arg0 != 37) {
         this.method5330(119);
      }

      return this.method5331(arg3, new Object[]{arg5, arg2, arg4}, 17, false, arg1);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method5337(int arg0) {
      synchronized(this) {
         this.field10739 = true;
         this.notifyAll();
      }

      try {
         this.field10754.join();
      } catch (InterruptedException var8) {
      }

      if (this.field10746 != null) {
         try {
            this.field10746.method3744(1571);
         } catch (IOException var7) {
         }
      }

      if (this.field10748 != null) {
         try {
            this.field10748.method3744(1571);
         } catch (IOException var6) {
         }
      }

      if (arg0 != 1) {
         this.method5336((byte)3, -53, (int[])null, 125, (Point)null, (Component)null);
      }

      if (this.field10737 != null) {
         for(int var3 = 0; this.field10737.length > var3; ++var3) {
            if (this.field10737[var3] != null) {
               try {
                  this.field10737[var3].method3744(1571);
               } catch (IOException var5) {
               }
            }
         }
      }

      if (this.field10740 != null) {
         try {
            this.field10740.method3744(arg0 ^ 1570);
         } catch (IOException var4) {
         }
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(IILjava/lang/Runnable;)Lit;"
   )
   public final class769 method5338(int arg0, int arg1, Runnable arg2) {
      if (arg0 != 0) {
         field10758 = null;
      }

      return this.method5331(0, arg2, 2, false, arg1);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(II)Lit;"
   )
   public final class769 method5339(int arg0, int arg1) {
      if (arg1 <= 95) {
         field10744 = null;
      }

      return this.method5331(0, (Object)null, 3, false, arg0);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5340(int arg0) {
      field10753 = (long)arg0 + class163.method1353(-123);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lqp;"
   )
   private static final class492 method5341(String arg0, int arg1, int arg2, String arg3) {
      String var4;
      if (~arg1 != -34) {
         if (~arg1 != -35) {
            var4 = field10764[41] + arg0 + field10764[44] + arg3 + field10764[38];
         } else {
            var4 = field10764[41] + arg0 + field10764[44] + arg3 + field10764[42];
         }
      } else {
         var4 = field10764[41] + arg0 + field10764[44] + arg3 + field10764[48];
      }

      String[] var5 = new String[]{field10764[45], field10764[46], field10734, field10764[40], field10764[47], field10764[39], field10764[43], ""};
      int var6 = 0;
      if (arg2 <= 74) {
         method5341((String)null, 28, 70, (String)null);
      }

      while(~var6 > ~var5.length) {
         String var7 = var5[var6];
         if (~var7.length() >= -1 || (new File(var7)).exists()) {
            try {
               return new class492(new File(var7, var4), field10764[9], 10000L);
            } catch (Exception var9) {
            }
         }

         ++var6;
      }

      return null;
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(IIIII)Lit;"
   )
   public final class769 method5342(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 != 1) {
         field10747 = null;
      }

      return this.method5331((arg1 << 16) + arg3, (Object)null, 6, false, (arg4 << 16) + arg2);
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method5343(int arg0) {
      if (arg0 != -27358) {
         return false;
      } else if (!this.field10745) {
         return false;
      } else if (this.field10749) {
         return this.field10742 != null;
      } else {
         return this.field10738 != null;
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V"
   )
   public class736(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field10751 = field10764[3];
      field10759 = arg1;
      field10732 = field10764[7];
      this.field10745 = arg3;
      field10735 = arg0;

      try {
         field10732 = System.getProperty(field10764[10]);
         field10751 = System.getProperty(field10764[22]);
      } catch (Exception var20) {
      }

      if (~field10732.toLowerCase().indexOf(field10764[6]) != 0) {
         this.field10749 = true;
      }

      try {
         field10750 = System.getProperty(field10764[20]);
      } catch (Exception var19) {
         field10750 = field10764[7];
      }

      field10758 = field10750.toLowerCase();

      try {
         field10757 = System.getProperty(field10764[16]).toLowerCase();
      } catch (Exception var18) {
         field10757 = "";
      }

      try {
         field10756 = System.getProperty(field10764[21]).toLowerCase();
      } catch (Exception var17) {
         field10756 = "";
      }

      try {
         field10734 = System.getProperty(field10764[8]);
         if (field10734 != null) {
            field10734 = field10734 + "/";
         }
      } catch (Exception var16) {
      }

      if (field10734 == null) {
         field10734 = field10764[2];
      }

      try {
         this.field10755 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field10749) {
         try {
            field10747 = Class.forName(field10764[14]).getDeclaredMethod(field10764[1], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field10744 = Class.forName(field10764[11]).getDeclaredMethod(field10764[13], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class85.method808(field10735, 0, field10759);
      if (this.field10745) {
         this.field10740 = new class492(class85.method810(field10735, (String)null, -66, field10764[4]), field10764[9], 25L);
         this.field10746 = new class492(class85.method809(-443, field10764[12]), field10764[9], 314572800L);
         this.field10748 = new class492(class85.method809(-443, field10764[17]), field10764[9], 1048576L);
         this.field10737 = new class492[arg2];

         for(int var5 = 0; var5 < arg2; ++var5) {
            this.field10737[var5] = new class492(class85.method809(-443, field10764[5] + var5), field10764[9], 1048576L);
         }

         if (this.field10749) {
            try {
               this.field10752 = Class.forName(field10764[18]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (!this.field10749) {
               this.field10738 = Class.forName(field10764[0]).newInstance();
            } else {
               this.field10742 = new class443();
            }
         } catch (Throwable var11) {
         }

         try {
            if (!this.field10749) {
               this.field10743 = Class.forName(field10764[15]).newInstance();
            } else {
               this.field10741 = new class610();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field10745 && !this.field10749) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; ~var9 > ~var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field10764[19])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field10739 = false;
      this.field10754 = new Thread(this);
      this.field10754.setPriority(10);
      this.field10754.setDaemon(true);
      this.field10754.start();
   }

   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(B)Lit;"
   )
   public final class769 method5344(byte arg0) {
      return arg0 != -88 ? null : this.method5331(0, (Object)null, 5, false, 0);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gj",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5345(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
