package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("aj")
public class class13 extends SSLSocket {

    // $FF: synthetic field
    public final class16 this$0;

    // $FF: synthetic field
    public final TlsClientProtocol val$tlsClientProtocol;

    // $FF: synthetic field
    public final String val$host;

    @ObfuscatedName("aj.at")
    public Certificate[] field60;

    public class13(class16 arg0, TlsClientProtocol arg1, String arg2) {
        this.this$0 = arg0;
        this.val$tlsClientProtocol = arg1;
        this.val$host = arg2;
    }

    public InputStream getInputStream() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.val$tlsClientProtocol.getOutputStream();
    }

    public synchronized void close() throws IOException {
        this.val$tlsClientProtocol.close();
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener arg0) {
    }

    public boolean getEnableSessionCreation() {
        return false;
    }

    public String[] getEnabledCipherSuites() {
        return null;
    }

    public String[] getEnabledProtocols() {
        return null;
    }

    public boolean getNeedClientAuth() {
        return false;
    }

    public SSLSession getSession() {
        return new class18(this);
    }

    public String[] getSupportedProtocols() {
        return null;
    }

    public String[] getSupportedCipherSuites() {
        return null;
    }

    public boolean getUseClientMode() {
        return false;
    }

    public boolean getWantClientAuth() {
        return false;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener arg0) {
    }

    public void setEnableSessionCreation(boolean arg0) {
    }

    public void setEnabledCipherSuites(String[] arg0) {
    }

    public void setEnabledProtocols(String[] arg0) {
    }

    public void setNeedClientAuth(boolean arg0) {
    }

    public void setUseClientMode(boolean arg0) {
    }

    public void setWantClientAuth(boolean arg0) {
    }

    public void startHandshake() throws IOException {
        this.val$tlsClientProtocol.connect(new class14(this));
    }
}
