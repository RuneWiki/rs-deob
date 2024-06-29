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

@OriginalClass("client!oo")
public class class651 implements Runnable {
   @OriginalMember(
      owner = "client!oo",
      name = "A",
      descriptor = "Liga;"
   )
   public class479 field9440 = null;
   @OriginalMember(
      owner = "client!oo",
      name = "C",
      descriptor = "Liga;"
   )
   public class479 field9446 = null;
   @OriginalMember(
      owner = "client!oo",
      name = "m",
      descriptor = "Leca;"
   )
   private class789 field9432 = null;
   @OriginalMember(
      owner = "client!oo",
      name = "B",
      descriptor = "Leca;"
   )
   private class789 field9447 = null;
   @OriginalMember(
      owner = "client!oo",
      name = "f",
      descriptor = "Liga;"
   )
   public class479 field9438 = null;
   @OriginalMember(
      owner = "client!oo",
      name = "h",
      descriptor = "Z"
   )
   public boolean field9441 = false;
   @OriginalMember(
      owner = "client!oo",
      name = "u",
      descriptor = "Z"
   )
   public boolean field9456 = false;
   @OriginalMember(
      owner = "client!oo",
      name = "p",
      descriptor = "Z"
   )
   private boolean field9454 = false;
   @OriginalMember(
      owner = "client!oo",
      name = "d",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field9450;
   @OriginalMember(
      owner = "client!oo",
      name = "n",
      descriptor = "[Liga;"
   )
   public class479[] field9437;
   @OriginalMember(
      owner = "client!oo",
      name = "F",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9457;
   @OriginalMember(
      owner = "client!oo",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9442;
   @OriginalMember(
      owner = "client!oo",
      name = "D",
      descriptor = "Lta;"
   )
   private class222 field9443;
   @OriginalMember(
      owner = "client!oo",
      name = "i",
      descriptor = "Lit;"
   )
   private class671 field9445;
   @OriginalMember(
      owner = "client!oo",
      name = "g",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field9452;
   @OriginalMember(
      owner = "client!oo",
      name = "x",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9451;
   @OriginalMember(
      owner = "client!oo",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9464 = new String[]{method4795(method4794("(v\u0016QH#`\u0014\u001e 0v\rU")), method4795(method4794("\bv\u0007U\u001ebQ\u0015\\\nbD\u0003B\u0003'y")), method4795(method4794("(u")), method4795(method4794("/x\u0016U\u000b-b\u0013U")), method4795(method4794("(v\u0016QH#`\u0014\u001e6-~\u000eD")), method4795(method4794("!z\u0004\u0010I!7\u0013D\u00070c@\u0012\f`7B")), method4795(method4794("5~\u000e")), method4795(method4794("'o\tD")), method4795(method4794("'y\u0014U\u0014")), method4795(method4794("(v\u0016QH#`\u0014\u001e%-z\u0010_\b'y\u0014")), method4795(method4794("*c\u0014@\u0015x8O")), method4795(method4794("#u\u0003T\u0003$p\bY\f){\r^\t2f\u0012C\u00127a\u0017H\u001f8V\"s\"\u0007Q'x/\b\\,}(\rG1b5\u0016B6g>\u001bMP\u0001Tq#U\u0006Qz._\u0016[n9E\u001bK\u001d4Z\u001fL")), method4795(method4794("\u0019^")), method4795(method4794("1\u007f\u000fG\u00057e\u0013_\u0014")), method4795(method4794("1r\u0014S\u00131c\u000f]\u00057e\u0013_\u0014")), method4795(method4794(".~\u0013D\u000b-s\u0005C")), method4795(method4794(")z")), method4795(method4794("*c\u0014@\\m8")), method4795(method4794("/~\u0003B\t1x\u0006D")), method4795(method4794("s9Q")), method4795(method4794("7d\u0005BH*x\rU")), method4795(method4794("/v\t^9$~\fU9!v\u0003X\u0003ls\u0001DT")), method4795(method4794("/v\t^9$~\fU9!v\u0003X\u0003l~\u0004HTw\"")), method4795(method4794("1r\u0014v\t!b\u0013d\u0014#a\u0005B\u0015#{+U\u001f1R\u000eQ\u0004.r\u0004")), method4795(method4794("-`")), method4795(method4794("0v\u000eT\t/9\u0004Q\u0012")), method4795(method4794("-dNQ\u0014!\u007f")), method4795(method4794("(v\u0016QH#`\u0014\u001e%-y\u0014Q\u000f,r\u0012")), method4795(method4794("\u0003@4")), method4795(method4794("\u0017y\u000b^\t5y")), method4795(method4794("-dN^\u0007/r")), method4795(method4794("(v\u0016QH4r\u0012C\u000f-y")), method4795(method4794("(v\u0016QH4r\u000eT\t0")), method4795(method4794("/v\t^9$~\fU9!v\u0003X\u0003l~\u0004H")), method4795(method4794("0`")), method4795(method4794("-dNF\u00030d\t_\b")), method4795(method4794("<8")), method4795(method4794("1r\u0014v\t!b\u0013s\u001f!{\u0005b\t-c")), method4795(method4794("ls\u0001D")), method4795(method4794("!-OB\u0015!v\u0003X\u0003m")), method4795(method4794("\u001dg\u0012U\u0000'e\u0005^\u0005'd")), method4795(method4794("!-O")), method4795(method4794("\u001d`\t@H&v\u0014")), method4795(method4794("!-OG\u000f,y\u0014\u001f")), method4795(method4794("mc\r@I")), method4795(method4794("\u001de\u0003\u001e\u0002#c")), method4795(method4794("me\u0013S\u0007!\u007f\u0005\u001f")), method4795(method4794("!-OG\u000f,s\u000fG\u0015m")), method4795(method4794("(v\u0007U\u001e\u001d"))};
   @OriginalMember(
      owner = "client!oo",
      name = "q",
      descriptor = "J"
   )
   private static volatile long field9444 = 0L;
   @OriginalMember(
      owner = "client!oo",
      name = "b",
      descriptor = "I"
   )
   private static int field9453;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oo",
      name = "E",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9460;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9461;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oo",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9462;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oo",
      name = "l",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9463;
   @OriginalMember(
      owner = "client!oo",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9433;
   @OriginalMember(
      owner = "client!oo",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9434;
   @OriginalMember(
      owner = "client!oo",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9436;
   @OriginalMember(
      owner = "client!oo",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9439;
   @OriginalMember(
      owner = "client!oo",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9449;
   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9455;
   @OriginalMember(
      owner = "client!oo",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public static String field9458;
   @OriginalMember(
      owner = "client!oo",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   private static String field9459;
   @OriginalMember(
      owner = "client!oo",
      name = "k",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field9435;
   @OriginalMember(
      owner = "client!oo",
      name = "v",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field9448;

   @OriginalMember(
      owner = "client!oo",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4773(int arg0) {
      synchronized(this) {
         this.field9454 = true;
         this.notifyAll();
      }

      try {
         if (arg0 >= -76) {
            field9439 = null;
         }

         this.field9451.join();
      } catch (InterruptedException var8) {
      }

      if (this.field9438 != null) {
         try {
            this.field9438.method3627((byte)2);
         } catch (IOException var7) {
         }
      }

      if (this.field9446 != null) {
         try {
            this.field9446.method3627((byte)2);
         } catch (IOException var6) {
         }
      }

      if (this.field9437 != null) {
         for(int var3 = 0; ~this.field9437.length < ~var3; ++var3) {
            if (this.field9437[var3] != null) {
               try {
                  this.field9437[var3].method3627((byte)2);
               } catch (IOException var5) {
               }
            }
         }
      }

      if (this.field9440 != null) {
         try {
            this.field9440.method3627((byte)2);
         } catch (IOException var4) {
         }
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ILjava/awt/Frame;)Leca;"
   )
   public final class789 method4774(int arg0, Frame arg1) {
      if (arg0 != 0) {
         this.method4779(-100, 74, -65, -24, 98);
      }

      return this.method4780(arg0, 7, 0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;Z)Leca;"
   )
   public final class789 method4775(Class arg0, Class[] arg1, String arg2, boolean arg3) {
      if (!arg3) {
         this.method4773(97);
      }

      return this.method4780(0, 8, 0, new Object[]{arg0, arg2, arg1}, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(BI)Leca;"
   )
   public final class789 method4776(byte arg0, int arg1) {
      int var3 = -18 % ((arg0 - 14) / 45);
      return this.method4780(0, 3, arg1, (Object)null, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(true) {
         class789 var2;
         synchronized(this) {
            while(true) {
               if (this.field9454) {
                  return;
               }

               if (this.field9432 != null) {
                  var2 = this.field9432;
                  this.field9432 = this.field9432.field11539;
                  if (this.field9432 == null) {
                     this.field9447 = null;
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
            int var3 = var2.field11543;
            if (~var3 == -2) {
               if (field9444 > class57.method650(91)) {
                  throw new IOException();
               }

               var2.field11537 = new Socket(InetAddress.getByName((String)var2.field11541), var2.field11538);
            } else if (var3 != 22) {
               if (~var3 == -3) {
                  Thread var4 = new Thread((Runnable)var2.field11541);
                  var4.setDaemon(true);
                  var4.start();
                  var4.setPriority(var2.field11538);
                  var2.field11537 = var4;
               } else if (var3 == 4) {
                  if (~field9444 < ~class57.method650(92)) {
                     throw new IOException();
                  }

                  var2.field11537 = new DataInputStream(((URL)var2.field11541).openStream());
               } else if (~var3 == -9) {
                  Object[] var5 = (Object[])var2.field11541;
                  if (this.field9456 && ((Class)var5[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field11537 = ((Class)var5[0]).getDeclaredMethod((String)var5[1], (Class[])var5[2]);
               } else if (var3 != 9) {
                  if (~var3 == -19) {
                     Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                     var2.field11537 = var6.getContents((Object)null);
                  } else if (~var3 != -20) {
                     if (!this.field9456) {
                        throw new Exception("");
                     }

                     if (var3 != 3) {
                        if (~var3 == -22) {
                           if (field9444 > class57.method650(93)) {
                              throw new IOException();
                           }

                           var2.field11537 = InetAddress.getByName((String)var2.field11541).getAddress();
                        } else if (~var3 == -6) {
                           if (!this.field9441) {
                              var2.field11537 = Class.forName(field9464[16]).getMethod(field9464[15]).invoke(this.field9442);
                           } else {
                              var2.field11537 = this.field9443.method1868(-33);
                           }
                        } else if (~var3 == -7) {
                           Frame var7 = new Frame(field9464[1]);
                           var2.field11537 = var7;
                           var7.setResizable(false);
                           if (this.field9441) {
                              this.field9443.method1866(var2.field11540 >> 16, var7, var2.field11538 >>> 16, var2.field11538 & 65535, 65535 & var2.field11540, -115);
                           } else {
                              Class.forName(field9464[16]).getMethod(field9464[8], field9460 != null ? field9460 : (field9460 = method4793(field9464[0])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field9442, var7, new Integer(var2.field11538 >>> 16), new Integer(65535 & var2.field11538), new Integer(var2.field11540 >> 16), new Integer(var2.field11540 & 65535));
                           }
                        } else if (~var3 != -8) {
                           if (~var3 == -13) {
                              class479 var18 = method4786(field9453, (String)var2.field11541, -35, field9449);
                              var2.field11537 = var18;
                           } else if (~var3 == -14) {
                              class479 var8 = method4786(field9453, (String)var2.field11541, -35, "");
                              var2.field11537 = var8;
                           } else if (this.field9456 && var3 == 14) {
                              int var16 = var2.field11538;
                              int var17 = var2.field11540;
                              if (!this.field9441) {
                                 Class.forName(field9464[2]).getDeclaredMethod(field9464[3], Integer.TYPE, Integer.TYPE).invoke(this.field9452, new Integer(var16), new Integer(var17));
                              } else {
                                 this.field9445.method4913(var17, 65535, var16);
                              }
                           } else if (this.field9456 && var3 == 15) {
                              boolean var14 = ~var2.field11538 != -1;
                              Component var15 = (Component)var2.field11541;
                              if (!this.field9441) {
                                 Class.forName(field9464[2]).getDeclaredMethod(field9464[13], field9461 != null ? field9461 : (field9461 = method4793(field9464[9])), Boolean.TYPE).invoke(this.field9452, var15, new Boolean(var14));
                              } else {
                                 this.field9445.method4914(0, var15, var14);
                              }
                           } else if (!this.field9441 && ~var3 == -18) {
                              Object[] var9 = (Object[])var2.field11541;
                              Class.forName(field9464[2]).getDeclaredMethod(field9464[14], field9461 != null ? field9461 : (field9461 = method4793(field9464[9])), field9462 != null ? field9462 : (field9462 = method4793(field9464[12])), Integer.TYPE, Integer.TYPE, field9463 != null ? field9463 : (field9463 = method4793(field9464[4]))).invoke(this.field9452, (Component)var9[0], (int[])var9[1], new Integer(var2.field11538), new Integer(var2.field11540), (Point)var9[2]);
                           } else {
                              if (~var3 != -17) {
                                 throw new Exception("");
                              }

                              try {
                                 if (!field9433.startsWith(field9464[6])) {
                                    throw new Exception();
                                 }

                                 String var10 = (String)var2.field11541;
                                 if (!var10.startsWith(field9464[17]) && !var10.startsWith(field9464[10])) {
                                    throw new Exception();
                                 }

                                 String var11 = field9464[11];

                                 for(int var12 = 0; var10.length() > var12; ++var12) {
                                    if (var11.indexOf(var10.charAt(var12)) == -1) {
                                       throw new Exception();
                                    }
                                 }

                                 Runtime.getRuntime().exec(field9464[5] + var10 + "\"");
                                 var2.field11537 = null;
                              } catch (Exception var31) {
                                 var2.field11537 = var31;
                                 throw var31;
                              }
                           }
                        } else if (!this.field9441) {
                           Class.forName(field9464[16]).getMethod(field9464[7]).invoke(this.field9442);
                        } else {
                           this.field9443.method1867(true, (Frame)var2.field11541);
                        }
                     } else {
                        if (~class57.method650(113) > ~field9444) {
                           throw new IOException();
                        }

                        String var19 = (var2.field11538 >> 24 & 255) + "." + (255 & var2.field11538 >> 16) + "." + (255 & var2.field11538 >> 8) + "." + (var2.field11538 & 255);
                        var2.field11537 = InetAddress.getByName(var19).getHostName();
                     }
                  } else {
                     Transferable var20 = (Transferable)var2.field11541;
                     Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                     var21.setContents(var20, (ClipboardOwner)null);
                  }
               } else {
                  Object[] var22 = (Object[])var2.field11541;
                  if (this.field9456 && ((Class)var22[0]).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  var2.field11537 = ((Class)var22[0]).getDeclaredField((String)var22[1]);
               }
            } else {
               if (~field9444 < ~class57.method650(100)) {
                  throw new IOException();
               }

               try {
                  var2.field11537 = class775.method5602((String)var2.field11541, (byte)29, var2.field11538).method2527((byte)74);
               } catch (class5 var29) {
                  var2.field11537 = var29.getMessage();
                  throw var29;
               }
            }

            var2.field11542 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field11542 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Liga;"
   )
   public static final class479 method4777(String arg0, int arg1) {
      int var2 = 66 % ((39 - arg1) / 51);
      return method4786(field9453, arg0, -35, field9449);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4778(byte arg0) {
      int var2 = -45 / ((-1 - arg0) / 42);
      field9444 = class57.method650(99) - -5000L;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIIII)Leca;"
   )
   public final class789 method4779(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg3 != -807957232) {
         field9455 = null;
      }

      return this.method4780(0, 6, (arg4 << 16) + arg1, (Object)null, (arg2 << 16) + arg0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIILjava/lang/Object;I)Leca;"
   )
   private final class789 method4780(int arg0, int arg1, int arg2, Object arg3, int arg4) {
      class789 var6 = new class789();
      var6.field11541 = arg3;
      var6.field11543 = arg1;
      if (arg0 != 0) {
         field9455 = null;
      }

      var6.field11540 = arg4;
      var6.field11538 = arg2;
      synchronized(this) {
         if (this.field9447 == null) {
            this.field9447 = this.field9432 = var6;
         } else {
            this.field9447.field11539 = var6;
            this.field9447 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/io/File;[BB)Z"
   )
   public final boolean method4781(File arg0, byte[] arg1, byte arg2) {
      try {
         FileOutputStream var4 = new FileOutputStream(arg0);
         int var5 = -74 / ((19 - arg2) / 52);
         var4.write(arg1, 0, arg1.length);
         var4.close();
         return true;
      } catch (IOException var6) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Leca;"
   )
   public final class789 method4782(Class arg0, int arg1, String arg2) {
      return arg1 > -5 ? null : this.method4780(0, 9, 0, new Object[]{arg0, arg2}, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIILjava/awt/Component;Ljava/awt/Point;[I)Leca;"
   )
   public final class789 method4783(int arg0, int arg1, int arg2, Component arg3, Point arg4, int[] arg5) {
      return arg0 != -8760 ? null : this.method4780(0, 17, arg2, new Object[]{arg3, arg5, arg4}, arg1);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method4784(int arg0) {
      return arg0 != 10000 ? null : this.field9457;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ILjava/net/URL;)Leca;"
   )
   public final class789 method4785(int arg0, URL arg1) {
      if (arg0 != 4) {
         this.method4789((String)null, 8, true);
      }

      return this.method4780(0, 4, 0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ILjava/lang/String;ILjava/lang/String;)Liga;"
   )
   private static final class479 method4786(int arg0, String arg1, int arg2, String arg3) {
      if (arg2 != -35) {
         method4777((String)null, -31);
      }

      String var4;
      if (~arg0 == -34) {
         var4 = field9464[48] + arg3 + field9464[40] + arg1 + field9464[45];
      } else if (~arg0 == -35) {
         var4 = field9464[48] + arg3 + field9464[40] + arg1 + field9464[42];
      } else {
         var4 = field9464[48] + arg3 + field9464[40] + arg1 + field9464[38];
      }

      String[] var5 = new String[]{field9464[39], field9464[46], field9434, field9464[47], field9464[43], field9464[41], field9464[44], ""};

      for(int var6 = 0; ~var5.length < ~var6; ++var6) {
         String var7 = var5[var6];
         if (var7.length() <= 0 || (new File(var7)).exists()) {
            try {
               return new class479(new File(var7, var4), field9464[34], 10000L);
            } catch (Exception var9) {
            }
         }
      }

      return null;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "b",
      descriptor = "(I)Leca;"
   )
   public final class789 method4787(int arg0) {
      int var2 = -122 / ((72 - arg0) / 51);
      return this.method4780(0, 5, 0, (Object)null, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(BLjava/lang/String;)Leca;"
   )
   public final class789 method4788(byte arg0, String arg1) {
      int var3 = 45 % ((arg0 - 60) / 52);
      return this.method4780(0, 16, 0, arg1, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/String;IZ)Leca;"
   )
   public final class789 method4789(String arg0, int arg1, boolean arg2) {
      if (arg1 != -5160) {
         return null;
      } else {
         return arg2 ? this.method4780(0, 12, 0, arg0, 0) : this.method4780(0, 13, 0, arg0, 0);
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ZBLjava/lang/String;I)Leca;"
   )
   public final class789 method4790(boolean arg0, byte arg1, String arg2, int arg3) {
      if (arg1 != -68) {
         this.method4776((byte)119, 0);
      }

      return this.method4780(0, !arg0 ? 1 : 22, arg3, arg2, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4791(int arg0) {
      if (arg0 != -22516) {
         this.field9452 = null;
      }

      if (!this.field9456) {
         return false;
      } else if (!this.field9441) {
         return this.field9442 != null;
      } else {
         return this.field9443 != null;
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(BILjava/lang/Runnable;)Leca;"
   )
   public final class789 method4792(byte arg0, int arg1, Runnable arg2) {
      if (arg0 != -97) {
         field9436 = null;
      }

      return this.method4780(arg0 ^ -97, 2, arg1, arg2, 0);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V"
   )
   public class651(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field9436 = field9464[19];
      field9453 = arg0;
      field9449 = arg1;
      this.field9456 = arg3;
      field9455 = field9464[29];

      try {
         field9455 = System.getProperty(field9464[32]);
         field9436 = System.getProperty(field9464[31]);
      } catch (Exception var20) {
      }

      if (field9455.toLowerCase().indexOf(field9464[18]) != -1) {
         this.field9441 = true;
      }

      try {
         field9459 = System.getProperty(field9464[30]);
      } catch (Exception var19) {
         field9459 = field9464[29];
      }

      field9433 = field9459.toLowerCase();

      try {
         field9439 = System.getProperty(field9464[26]).toLowerCase();
      } catch (Exception var18) {
         field9439 = "";
      }

      try {
         field9458 = System.getProperty(field9464[35]).toLowerCase();
      } catch (Exception var17) {
         field9458 = "";
      }

      try {
         field9434 = System.getProperty(field9464[20]);
         if (field9434 != null) {
            field9434 = field9434 + "/";
         }
      } catch (Exception var16) {
      }

      if (field9434 == null) {
         field9434 = field9464[36];
      }

      try {
         this.field9450 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field9441) {
         try {
            field9435 = Class.forName(field9464[9]).getDeclaredMethod(field9464[23], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field9448 = Class.forName(field9464[27]).getDeclaredMethod(field9464[37], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class286.method2225(0, field9453, field9449);
      if (this.field9456) {
         this.field9440 = new class479(class286.method2223(field9464[25], (String)null, field9453, -3), field9464[34], 25L);
         this.field9438 = new class479(class286.method2224((byte)-55, field9464[21]), field9464[34], 314572800L);
         this.field9446 = new class479(class286.method2224((byte)-46, field9464[22]), field9464[34], 1048576L);
         this.field9437 = new class479[arg2];

         for(int var5 = 0; ~var5 > ~arg2; ++var5) {
            this.field9437[var5] = new class479(class286.method2224((byte)-73, field9464[33] + var5), field9464[34], 1048576L);
         }

         if (this.field9441) {
            try {
               this.field9457 = Class.forName(field9464[24]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (!this.field9441) {
               this.field9442 = Class.forName(field9464[16]).newInstance();
            } else {
               this.field9443 = new class222();
            }
         } catch (Throwable var11) {
         }

         try {
            if (this.field9441) {
               this.field9445 = new class671();
            } else {
               this.field9452 = Class.forName(field9464[2]).newInstance();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field9456 && !this.field9441) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; var9 < var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field9464[28])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field9454 = false;
      this.field9451 = new Thread(this);
      this.field9451.setPriority(10);
      this.field9451.setDaemon(true);
      this.field9451.start();
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4793(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
